import java.util.NoSuchElementException;

// 仿造 真正的(java.util.Queue)的Queue 接口
// 元素类型，固定成 Integer 类型，不用泛型
public interface Queue {
    // 这组方法通过特殊的返回值，通知错误

    // 插入
    // true 成功  false 失败（例如容量满了）
    boolean offer(Integer e);

    // 看队首元素，但不删除
    // 返回 null，代表，队列是空的
    Integer peek();

    // 返回并删除对手元素
    // 返回 null，代表，队列是空的
    Integer poll();

    // 这组方法通过抛出异常，通知错误

    // 插入
    // 永远返回 true
    default boolean add(Integer e) {
        if (offer(e) == false) {
            throw new IllegalStateException();
        }

        return true;
    }

    // 看队首元素，但不删除
    default Integer element() {
        Integer e = peek();
        if (e == null) {
            throw new NoSuchElementException();
        }

        return e;
    }

    // 返回并删除对手元素
    default Integer remove() {
        Integer e = poll();
        if (e == null) {
            throw new NoSuchElementException();
        }

        return e;
    }
}

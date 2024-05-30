package hus.oopold.Lab12_Review.mylist;


public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    @Override
    public String toString() {
        /* TODO */
        if (size() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            result.append('[').append(get(i)).append("] ");
        }

        // Remove the trailing space
        if (!result.isEmpty()) {
            result.setLength(result.length() - 1);
        }

        return result.toString();
    }
}

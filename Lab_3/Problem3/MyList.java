package Lab_3.Problem3;

public class MyList implements MyCollection {
    private Object[] elements = new Object[100];
    private int count = 0;

    public void add(Object element) {
        elements[count++] = element;
    }

    public void remove(Object element) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(element)) {
                for (int j = i; j < count - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                count--;
                break;
            }
        }
    }

    public boolean contains(Object element) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return count;
    }

    public void clear() {
        count = 0;
    }
}
package example4;

public class DynamicIntegerArray {
    private int array[];
    private int count;
    private int sizeOfArray;

    public DynamicIntegerArray() {
        array = new int[6];
        count = 0;
        sizeOfArray = 6;
    }

    public void addElement(int a) {
        if (count == sizeOfArray) {
            growSize();
        }
        array[count] = a;
        count++;
    }

    private void growSize() {
        int[] temp = null;
        if (count == sizeOfArray) {
            temp = new int[(int) (sizeOfArray * 1.5)];
            for (int i = 0; i < sizeOfArray; i++) {
                temp[i] = array[i];
            }
        }
        array = temp;
        sizeOfArray *= 1.5;
    }

    public int removeElementAt(int index) {
        int value = array[index];
        if (count > 0) {
            for (int i = index; i < count - 1; i++) {
                array[i] = array[i + 1];
            }
            array[count - 1] = 0;
            count--;
        }
        return value;
    }

    public void addElement(int index, int element) {
        if (count == sizeOfArray) {
            growSize();
        }
        for (int i = count - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        count++;
    }

    public void remove(int value) {
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                if (array[i] == value) {
                    array[i] = array[i+1];
                    array[count - 1] = 0;
                    count--;
                }
            }
        }
    }

    public void printArray() {
        for (int i = 0; i < this.count; i++) {
            System.out.print(this.array[i] + " ");
        }
    }

}

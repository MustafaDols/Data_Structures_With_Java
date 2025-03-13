package Before_data_Structures;

class GenericArray<T> {
        private T[] array;

        public GenericArray(int size) {
            if (size <= 0) {
                throw new IllegalArgumentException("Array size must be greater than zero.");
            }
            // Creating a generic array using reflection
            array = (T[]) new Object[size];
        }

        public void insertAtIndex(int index, T value) {
            if (index < 0 || index >= array.length) {
                throw new IllegalArgumentException("Invalid index: " + index);
            }
            array[index] = value;
        }

        public void printArray() {
            for (T element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            // Example usage
            GenericArray<Integer> integerArray = new GenericArray<>(5);
            integerArray.insertAtIndex(2, 42);
            integerArray.insertAtIndex(0, 10);
            integerArray.insertAtIndex(4, 99);

            System.out.print("Integer Array: ");
            integerArray.printArray();

            GenericArray<String> stringArray = new GenericArray<>(3);
            stringArray.insertAtIndex(0, "Hello");
            stringArray.insertAtIndex(2, "World");

            System.out.print("String Array: ");
            stringArray.printArray();
        }
    }

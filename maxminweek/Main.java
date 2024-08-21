public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {3, 5, 1, 4, 2};
        String[] stringArray = {"apple", "orange", "banana", "grape"};
        Character[] charArray = {'d', 'a', 'c', 'b'};
        Float[] floatArray = {3.5f, 2.1f, 4.8f, 1.2f};

        System.out.println("Max Integer: " + GenericArrayUtils.findMax(intArray));
        System.out.println("Min Integer: " + GenericArrayUtils.findMin(intArray));

        System.out.println("Max String: " + GenericArrayUtils.findMax(stringArray));
        System.out.println("Min String: " + GenericArrayUtils.findMin(stringArray));

        System.out.println("Max Character: " + GenericArrayUtils.findMax(charArray));
        System.out.println("Min Character: " + GenericArrayUtils.findMin(charArray));

        System.out.println("Max Float: " + GenericArrayUtils.findMax(floatArray));
        System.out.println("Min Float: " + GenericArrayUtils.findMin(floatArray));
    }
}

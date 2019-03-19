package stack;

public class Implementation {
    public static void main(String[] args) {
        StackArray stackArray = new StackArray();

        stackArray.push(1);
        System.out.println(stackArray.size());
        System.out.println(stackArray.toString());
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(1);
//        stackArray.push(1);
//        stackArray.push(1);
//        stackArray.push(1);
        System.out.println(stackArray.toString());
        stackArray.push(1);
        stackArray.push(1);
        stackArray.push(1);

        System.out.println(stackArray.toString());
        System.out.println(stackArray.size());
        System.out.println();
//        stackArray.push(4);


        System.out.println(stackArray.pop());
        System.out.println(stackArray.toString());
        System.out.println(stackArray.size());

        System.out.println(stackArray.pop());
        System.out.println(stackArray.toString());
        System.out.println(stackArray.size());


        System.out.println(stackArray.pop());
        System.out.println(stackArray.toString());
        System.out.println(stackArray.size());

        System.out.println(stackArray.pop());
        System.out.println(stackArray.toString());

        System.out.println(stackArray.size());

        System.out.println(stackArray.isEmpty());
        System.out.println(stackArray.pop());
        System.out.println(stackArray.pop());
        System.out.println(stackArray.pop());
        System.out.println(stackArray.pop());
        System.out.println(stackArray.isEmpty());


//        System.out.println(stackArray.pop());


//        System.out.println(stackArray.toString());

    }

}

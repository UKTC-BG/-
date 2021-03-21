package HEURISTIC_ALGORITHMS;

/*Algorithm
Point 1 => Get capacity of bag , their weight and create array with weights
	Point 1.1 => get capacity of bag
    Point 1.2 => get packages count
    Point 1.3 => create array with packages count length
Point 2 => check for valid package count
Point 3 => get weight of package and add it in array
Point 4 => sort weights befor check
	Point 4.1 => mark first element as sorted
    Point 4.2 => get the next element
    Point 4.3 => check which is bigger
    Point 4.4 => swap if it needs
    Point 4.5 => set next element as sorted and repeat loop
Point 5 => check with greedy alg can packages fit in bag and count all process
	Point 5.1 => create counter
    Point 5.2 => create index for loop
    Point 5.3 => loop capacity while is grater than 0
    Point 5.4 => check if index is bigger than length of array
    Point 5.5 => if 5.4 = true => check can weight fit in bagpack
    Point 5.6 => if 5.4 = false => break loop and return result to user
    Point 5.7 => if 5.5 = true => devide weight from capacity and increase counter
	Point 5.8 => if 5.5 = false => increase index by 1
*/


import java.util.Scanner;
import java.util.Arrays;

class bagpack{

    public static void sortWeights(int[] arr){
        //insertion sort
        for(int i = 1; i < arr.length; i++){

            int getedEl = arr[i];
            int lastSorted = i -1;

            while(lastSorted >= 0 && arr[lastSorted] < getedEl){
                //4.3)
                arr[lastSorted + 1] = arr[lastSorted];
                //4.5)
                lastSorted --;
            }
            //4.5)
            arr[lastSorted + 1] = getedEl;

        }


    }
    public static void bagPackageCounterCheck(int capacity , int[] weights ){
        int[] statistic = new int[weights.length];

        int index = 0;

        while(capacity > 0){

            if(index < weights.length){

                if(capacity / weights[index] > 0){
                    System.out.println("Capacity --> " + capacity);
                    System.out.println("-----------------------------------");
                    System.out.println();

                    System.out.println("Capacity --> " + capacity);
                    capacity -= weights[index];
                    statistic[index] ++;
                    System.out.println(" Weight is --> " + weights[index] + "\n Statistics -> " + Arrays.toString(statistic) );

                    System.out.println();
                    System.out.println("-----------------------------------");
                }else{
                    index ++;
                }


            }else{
                break;
            }

        }
        if(capacity > 0){
            System.out.println("There is no answer! Rest --> " + capacity);
        }else{
            System.out.println("There is answer! No rest!");

        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Point 1)
        System.out.print("Enter backpack capacity --> ");
        int bagCapacity = scanner.nextInt(); //Point  1.1)
        while(bagCapacity < 1){
            System.out.print("Enter valid bag capacity (1+) : ");
            bagCapacity = scanner.nextInt();
        }

        System.out.print("How many items you have for backpack (2-5) --> ");
        int items = scanner.nextInt(); //Point 1.2)

        //Point 2)
        while(items < 2 || items > 5 ){
            System.out.print("Enter valid number -- > ");
            items = scanner.nextInt();
        }

        int[] itemWeight = new int[items]; //Point 1.3)

        //Point 3)
        for(int i = 0; i < items;i++){
            System.out.printf("How many kilograms do the items weight? [%d] :",i);
            int kilos = scanner.nextInt();
            while(kilos < 2){
                System.out.print("Enter valid kilos (1+) : ");
                kilos = scanner.nextInt();
            }
            itemWeight[i] = kilos;
        }


        //System.out.print("Before sort" + Arrays.toString(itemWeight));
        //Point 4)
        sortWeights(itemWeight);

        //System.out.print("After sort" + Arrays.toString(itemWeight));
        //Point 5)
        bagPackageCounterCheck(bagCapacity , itemWeight);


    }
}

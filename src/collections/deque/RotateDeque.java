package collections.deque;
import java.util.*;

public class RotateDeque {

    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        if(type==1){
            for(int i=0;i<k;i++){
                int val = dq.pollLast();
                System.out.println("val :"+val);
                dq.addFirst(val);
            }
        }
        if(type==2){
            for(int i=0;i<k;i++){
                int val = dq.pollFirst();
                dq.add(val);
            }
        }


    }

    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>() ;
        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        dq.add(5);
        dq.add(6);

        rotateDeque(dq, 2,2);
        System.out.println(dq);


    }
}

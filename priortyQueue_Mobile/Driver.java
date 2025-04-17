package priortyQueue_Mobile;

import java.util.*;;
public class Driver {
	public static void main(String[] args) {
		Queue<Mobile> q = new PriorityQueue<Mobile>();;
		q.add(new Mobile("mi","note",8999));
		q.add(new Mobile("apple","69",222222));
		System.out.println(q);
	}

}

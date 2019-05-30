package CuatroKyu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BusquedaBinariaXLevel {

	public static void main(String[] args) {
		
		Node n2 = new Node(null, null, 8);
		Node n3 = new Node(null, null, 9);
		Node n4 = new Node(null, null, 5);
		Node n5 = new Node(null, null, 1);
		Node n6 = new Node(null, null, 3);
		
		
		n3.right = n4;
		n2.left = n5;
		n2.right = n6;
		n5.left = new Node(null,null,10);
		n4.right  = new Node(null,null,13);
		
		Node n1 = new Node(n2, n3, 2);
		
		System.out.println(treeByLevels(n1));
		
	}
	
	public static List<Integer> treeByLevels(Node node){
		Map<Integer,List<Integer>> m = new HashMap<>();
		tree(node,m,0);
		Collection<List<Integer>> data = m.values();
		Iterator<List<Integer>> it = data.iterator();
		List<Integer> rspt = new ArrayList<>();
		while (it.hasNext()) {
			rspt.addAll(it.next());
		}
	    return rspt;
	 }
	
	public static void tree(Node node,Map<Integer, List<Integer>> map,int n) {
		
		if(node==null) {
		}else {
			if(map.containsKey(n)) {
				List<Integer> list = map.get(n);
				list.add(node.value);
			}else {
				List<Integer> neww = new ArrayList<>();
				neww.add(node.value);
				map.put(n,neww);
			}
			tree(node.left,map,n+1);
			tree(node.right,map,n+1);
		}
		
	}
	
}

class Node {
	public Node left;
	public Node right;
	public int value;

	public Node(Node l, Node r, int v) {
		left = l;
	    right = r;
	    value = v;
	}
}



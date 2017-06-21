package main;

public class OrthogonalLinkedList {

	Node initial;
	int size;

	public OrthogonalLinkedList create() {
		OrthogonalLinkedList orthogonalLinkedList = new OrthogonalLinkedList();
		orthogonalLinkedList.initial = new Node();
		orthogonalLinkedList.size = 0;
		return orthogonalLinkedList;
	}

	public void put(int u, int i, int r) {
		Node node = new Node();
		node.user = u;
		node.item = i;
		node.rate = r;
		if (size == 0) {
			initial = node;
			node.down = null;
			node.right = null;
		} else {
			
		}
	}

}

//NodeWay- James Huang, Richard Wong, Eddie Zhu
//APCS2 pd1
//L#02 -- All Hands on Deque!
//2018-04-19

/*****************************************************
 * class Dequester
 * Implements Deque using doubly linked nodes
 *****************************************************/

public class Dequester implements Deque {

    //instance vars
    public DLLNode _head, _tail;
    private int _size;

    public Dequester(){
	_head = _tail = null; //queue should have no elements at birth
	_size = 0;
	/**
	_head = new DLLNode(null, null, _tail);
	_tail= new DLLNode(null, _head, null);//links the two lists
	**/
    }

    public void addFirst(String e){ //adds to beginning
	_head = new DLLNode( e, null, _head );
	if (isEmpty()) {
	    _tail = _head; // head and tail should point to the same node
	}
	else {
	    _head.getNext().setPrev( _head );
	}
	_size++;
	
	/**
	 //This would result in some conflicts because _tail would be null 
	 //if there was only 1 node

	if (isEmpty()) {
	    _head = new DLLNode(e, null,_tail);//makes this the first element, sets _tail as end

	}
	_head = new DLLNode(e, null, _head);//puts current item in front, makes rest of _list the CDR
	**/
    }

    public void addLast(String e){ //adds to end
	_tail = new DLLNode( e, _tail, null );
	if (isEmpty()) {
	    _head = _tail; // head and tail should point to the same node
	}
	else {
	    _tail.getPrev().setNext( _tail );
	}
	_size++;
	
	/**
	   //This would result in some conflicts because _head would be null
	   //if there was only 1 node
	if (isEmpty()) {
	    _tail=new DLLNode(e, _list, null);//sets this one as the last one
	}
	_tail=new DLLNode(e, _tail, null);//links this to the previous last element, puts it after
	**/
    }
    public boolean isEmpty() {//new fxn to keep track of size(used for addFirst and addLast)
	return _size <= 0;
	

    }

    public static void main(String[] args){
	/**************
	Dequester test1 = new Dequester();
	test1.addFirst("Ding");
	System.out.println(test1._list.toString());
	test1.addFirst("Dong");
	System.out.println(test1._list.toString());
	test1.addFirst("PING");
	System.out.println(test1._list.toString());
	test1.addFirst("pong");
	System.out.println(test1._list.toString());
	test1.addFirst("poong");

	System.out.println(test1._list.toString());

	test1.addLast("king");
       	test1.addLast("kong");
	test1.addLast("keng");
	test1.addLast("kang");

      	System.out.println(test1._list.toString());
	**************/



    }

}

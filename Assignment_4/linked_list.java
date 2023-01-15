class linked_list
{
  
    /* A linked list node */
    static class Node 
    {
        int data;
        Node next;
    };
  
    /* Prints a linked list in reverse manner */
    static void fun1(Node head)
    {
        if (head == null)
        {
            return;
        }
  
        fun1(head.next);
        System.out.print(head.data + " ");
    }
  
    /* prints alternate nodes of a Linked List, first 
    from head to end, and then from end to head. */
    static void fun2(Node start)
    {
        if (start == null)
        {
            return;
        }
        System.out.print(start.data + " ");
  
        if (start.next != null)
        {
            fun2(start.next.next);
        }
        System.out.print(start.data + " ");
    }
  
    /* UTILITY FUNCTIONS TO TEST fun1() and fun2() */
    /* Given a reference (pointer to pointer) to the head 
    of a list and an int, push a new node on the front 
    of the list. */
    static Node push(Node head_ref, int new_data) 
    {
        /* allocate node */
        Node new_node = new Node();
  
        /* put in the data */
        new_node.data = new_data;
  
        /* link the old list off the new node */
        new_node.next = (head_ref);
  
        /* move the head to point to the new node */
        (head_ref) = new_node;
        return head_ref;
    }
  
    /* Driver code */
    public static void main(String[] args) 
    {
        /* Start with the empty list */
        Node head = null;
  
        /* Using push() to construct below list 
        1->2->3->4->5 */
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);
  
        System.out.print("Output of fun1() for " + 
                         "list 1->2->3->4->5 \n");
        fun1(head);
  
        System.out.print("\nOutput of fun2() for " +
                           "list 1->2->3->4->5 \n");
        fun2(head);
    }
}

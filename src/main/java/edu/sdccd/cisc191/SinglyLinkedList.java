package edu.sdccd.cisc191;

class SinglyLinkedList<T>
{
    class Node
    {
        T data;
        Node next;
    };

    /**
     * recursively finds k-th node, deletes, and returns new head
     *
     * @param head the node to start at
     * @param k the kth element to remove (first element at 0)
     * @return the new head node with the kth element removed
     */
    public Node remove(Node head, int k)
    {
        if(k == 0){
            return head.next;
        }
        head.next = remove(head.next, k- 1);
        return head;
    }

    /**
     *  inserts node at the beginning of the list
     * @param head the node to start at
     * @param new_data data to insert into the list
     * @return the new head node containing new_data followed with the rest of the linked list
     */
    public Node push(Node head, T new_data)
    {
        Node newNode = new Node();
        newNode.data = new_data;

        if(head == null){
            return newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    /**
     * recursively prints list starting from head
     * @param head the node to start at
     * @return a space separated string containing the data of each node starting from the head to the tail, end with a trailing space
     */
    public String toString(Node head)
    {
        if (head == null){
            return "";
        }
        return head.data + " " + toString(head.next);
    }
}
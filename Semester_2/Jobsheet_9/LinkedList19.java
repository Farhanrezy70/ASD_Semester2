package Jobsheet_9;

public class LinkedList19 {
    Node19 head;

    public boolean isEmpty(){
        return (head == null);
    }

    public void print(){
        if  (!isEmpty()) {
            System.out.print("Isi linked list : ");
            Node19 currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }

            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input) {
        Node19 newNode = new Node19(input, null);

        if (isEmpty()) {
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input) {
        Node19 newNode = new Node19(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node19 currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input) {
        Node19 newNode = new Node19(input, null);

        if (!isEmpty()) {
            Node19 currentNode = head;

            do {
                if (currentNode.data == key){
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }

                currentNode = currentNode.next;
            }while (currentNode != null);
        }else{
            System.out.print("Linked list kosong");
        }
    }

    public int getData(int index) {
        Node19 currentNode = head;

        for (int i = 0; i > index; i++){
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
    public int indexOf(int key){
        Node19 currentNode = head;
        int index = 0;

        while (currentNode != null  && currentNode.data != key){
            currentNode = currentNode.next;
            index++;
        }
        if (currentNode == null) {
            return -1;
        }else {
            return index;
        }
    }
    public void removeFirst(){
        if (!isEmpty()){
            head = head.next;
        }else{
            System.out.println("Linked list kosong");
        }
    }
    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked list kosong");
        }else if (head.next == null) {
            head = null;
        }else {
            Node19 currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.next == null){
                    currentNode.next = null;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
    public void remove (int key){
        if (isEmpty()){
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node19 currentNode = head;

            while (currentNode.next != null){
                if(currentNode.next.data == key){
                    currentNode.next = currentNode.next.next;
                    
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void insertAt (int index, int key) {
        Node19 newNode = new Node19(key, head);
        if (index < 0){
            System.out.println("Index tidak valid");
        }else if (index == 0){
            newNode.next = head;
            head = newNode;
        }else{
            Node19 current = head;
            int currentIndex = 0;
            while (currentIndex < index -1) {
                current = current.next;
                currentIndex++;
            }
            if (current == null){
                System.out.println("Index melebihi batas");
            }else {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }  
    public void insertBefore(int key, int input) {
        Node19 newNode = new Node19(input, null);
        if(!isEmpty()) {
            if (head.data == key){
                newNode.next = head;
                head = newNode;
            }else {
                Node19 currentNode = head;
                Node19 prevNode = null;
                do{
                    if (currentNode.data == key) {
                        newNode.next = currentNode;
                        prevNode.next = newNode;
                        break;
                    }
                    prevNode = currentNode;
                    currentNode = currentNode.next;
                }while (currentNode != null);
            }
        }else {
            System.out.println("Linked List kosong");
        }
    }

    public void removeAt (int index) {
        if (isEmpty()){
            System.out.println("Linked List kosong");
        }else if (index == 0){
            removeFirst();
        }else{
            Node19 currentNode = head;
            int listIndex = 0;
            while (currentNode.next != null && listIndex < index) {
                if (listIndex == index -1){
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
                listIndex++;
            }
        }
    }
}   

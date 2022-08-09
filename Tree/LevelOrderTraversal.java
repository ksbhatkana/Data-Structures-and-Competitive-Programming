//To print everything in one line
void printLevelOrder(Node root){
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
        Node cur = queue.poll();    
        System.out.println(cur.val);
        if(cur.left != null)
            queue.add(cur.left);
        if(cur.right != null)
            queue.add(cur.right);
    }
}

//To print level-wise in new line
void printLevelOrder(Node root){
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    queue.add(null);
    while(!queue.isEmpty()){
        Node cur = queue.poll();
        if(cur == null){
            if(queue.isEmpty()){
                return;
            }
            queue.add(null);
            System.out.println();
            continue;
        }    
        System.out.println(cur.val);
        if(cur.left != null)
            queue.add(cur.left);
        if(cur.right != null)
            queue.add(cur.right);
    }
}

//Leetcode is a modified question, where we have to return list of list. Check it

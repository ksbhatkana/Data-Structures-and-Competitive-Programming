int maxValue(Node root){
    if(root == null) return Integer.MIN_VALUE;
    return Math.max(root.data, Math.max(maxValue(root.left), maxValue(root.right)));
}

//It makes use of O(h) space complexity, and O(n) time complexity in worst scenario.

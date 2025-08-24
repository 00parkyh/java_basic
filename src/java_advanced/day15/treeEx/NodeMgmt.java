package java_advanced.day15.treeEx;
//노드 클래스 만들기
public class NodeMgmt {

    Node head = null;

    public class Node {
        Node left, right;
        int value;
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    public boolean insetNode(int data){
        //CASE1 : 노드가 하나도 없을때
        if(head == null){
            this.head = new Node(data);
        } else {
            Node findNode = this.head;
            while (true) {
                //CASE2 : 노드가 하나 이상 들어가 있을때
                //CASE2-1 : 현재 노드 왼쪽에 노드가 들어가야 할때


                //CASE2-2 : 현재 노드 오른쪽에 노드가 들어가야 할때

            }
        }
        return true;
    }
}

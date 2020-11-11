//输入两个链表，找出它们的第一个公共结点

    public Node getIntersectionNode(Node headA, Node headB) {
        if(headA == null || headB == null) {
            return null;
        }
        Node pointLong = headA;
        Node pointShort = headB;
        int lenA = 0;
        int lenB = 0;
        while (pointLong != null) {
            lenA++;
            pointLong = pointLong.next;
        }
        while (pointShort != null) {
            lenB++;
            pointShort = pointShort.next;
        }
        pointLong = headA;
        pointShort = headB;
        int len = lenA-lenB;
        if(len < 0) {
            pointLong = headB;
            pointShort = headA;
            len = lenB-lenA;
        }
        while (len > 0){
            pointLong = pointLong.next;
            len--;
        }
        while (pointLong != pointShort && pointLong != null && pointShort != null) {
            pointLong = pointLong.next;
            pointShort = pointShort.next;
        }
        if(pointLong == pointShort && pointLong != null) {
            return pointLong;
        }
        return null;
    }

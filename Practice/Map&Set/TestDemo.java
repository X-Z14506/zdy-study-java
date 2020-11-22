public class Main {
    //1.list中存放10万个数据，找出第一个重复的数据
    public static void main1(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        //给list存入10个随机数
        for (int i = 0;i < 10_0000; i++) {
            int num = random.nextInt(10_0000);
            list.add(num);
        }
        //从get方法得到list中的值，如果set中存在这个值，则输出
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0;i < 10_0000;i++) {
            if (set.contains(list.get(i))) {
                System.out.println(list.get(i));
                return;
            }
            else {
                set.add(list.get(i));
            }
        }
    }


    //3.将10万个数据，统计重复出现的数据及次数；
     static HashMap<Integer,Integer> map = new HashMap<>();
    public  static void main2(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Random random = new Random();

        //给list存入10个随机数
        for (int i = 0;i < 50; i++) {
            int num = random.nextInt(50);
            list1.add(num);
        }

        //遍历list1
        for (Integer key:list1) {
            if (map.get(key) == null) {
                map.put(key,1);
            } else {
                int val = map.get(key);
                map.put(key,val+1);
            }
        }
        for (Map.Entry<Integer,Integer>entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("重复的数字："+entry.getKey()+"次数："+entry.getValue());
            }
        }
//        重复的数字：1次数：2
//        重复的数字：2次数：2
//        重复的数字：6次数：2
//        重复的数字：7次数：3
//        重复的数字：18次数：3
//        重复的数字：23次数：2
//        重复的数字：25次数：3
//        重复的数字：27次数：3
//        重复的数字：40次数：3
//        重复的数字：41次数：3
//        重复的数字：43次数：2
//        重复的数字：45次数：2
    }
    
    
    
    
    //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    public int singleNumber(int[] nums) {
        //方法二：用异或方法
        int ret = 0;
        for (int i : nums) {
            ret ^= i;
        }
        return ret;

        /*方法一
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i :nums) {
            if (hashSet.contains(i)) {
                hashSet.remove(i);
            }else {
                hashSet.add(i);
            }
        }
        for (int i:nums) {
            if (hashSet.contains(i)) {
                return i;
            }
        }
        return -1;

         */
    }



   //给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点
    //要求返回这个链表的 深拷贝。 
    //
    //我们用一个由 n 个节点组成的链表来表示输入/输出中的链表。每个节点用一个 [val, random_index] 表示：
    //
    //val：一个表示 Node.val 的整数。
    //random_index：随机指针指向的节点索引（范围从 0 到 n-1）；如果不指向任何节点，则为  null 。

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        Node cur = head;
        HashMap<Node,Node> map = new HashMap<>();
        while (cur != null) {

            //每次进入循环，都创建一个新节点，存入当前cur的val；
            Node node =new Node(cur.val);

            //建立新老结点的对应关系
            map.put(cur,node);
            cur = cur.next;
        }
        //循环结束，链表遍历结束，说明cur此时为空，且新老结点的对应关系已经建立完成

        cur = head;
        //再遍历一边老链表，因为新老链表对应关系已经存在，也就相当于遍历一遍新链表，
        // 将老链表的next值和random值赋给对应的新链表的next和random
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(head);
    }




 //771. 宝石与石头
    // 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 
    // S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
    // J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。

    public int numJewelsInStones(String J, String S) {
        HashSet<Character> hashSet = new HashSet<>();
        int count = 0;

        //先把宝石放到集合当中
        char[] chJ = J.toCharArray();
        for (char ch1 : chJ) {
            hashSet.add(ch1);
        }

        //遍历石头，找到石头中的宝石
        char[] chS = S.toCharArray();
        for (char ch2 : chS) {
            //找到一颗宝石，count自加一次；遍历完石头，count就是宝石数量
            if (hashSet.contains(ch2)) {
                count++;
            }
        }
        return count;
    }
    
    
    
    
    
    
    //旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。
    //现在给出应该输入的一段文字、以及实际被输入的文字，请你列出
    //肯定坏掉的那些键。
    //输入：7_This_is_a_test   显示：_hs_s_a_es
    //输出：7TI （即这三个键坏了）

    public static void brokenKey(String strIn,String strAct) {
        //1.把实际显示的字符 strAct 放到集合中
        HashSet<Character> setAct = new HashSet<>();
        for (char chAct:strAct.toUpperCase().toCharArray()) {
            setAct.add(chAct);
        }

        //此时setAct中存放的就是实际显示出来的字符，即未坏掉的键
        //2.遍历输入的字符串strIn,并且将坏掉的键放入另外一个集合

        HashSet<Character> setBroken = new HashSet<>();
        char[] strInTo = strIn.toUpperCase().toCharArray();

        //chBroken是坏键
        for (char chBroken:strInTo) {
            if (!setAct.contains(chBroken) && !setBroken.contains(chBroken)) {
                setBroken.add(chBroken);
                System.out.print(chBroken);//7TI
            }
        }
    }




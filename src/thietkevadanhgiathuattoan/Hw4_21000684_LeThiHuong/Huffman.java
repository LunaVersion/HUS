package thietkevadanhgiathuattoan.Hw4_21000684_LeThiHuong;

import java.util.*;

public class Huffman {

    static class HuffmanNode {
        int data;
        char character;
        HuffmanNode left, right;

        HuffmanNode(int data, char character) {
            this.data = data;
            this.character = character;
            left = right = null;
        }
    }

    static class MyComparator implements Comparator<HuffmanNode> {
        public int compare(HuffmanNode x, HuffmanNode y) {
            return x.data - y.data;
        }
    }
    static void printCodes(HuffmanNode root, String s) {
        if (root.left == null && root.right == null && Character.isLetter(root.character)) {
            System.out.println(root.character + " = " + s);
            return;
        }
        assert root.left != null;
        printCodes(root.left, s + "0");
        printCodes(root.right, s + "1");
    }

    public static void main(String[] args) {
        int n = 6;
        char[] charArray = {'A', 'B', 'C', 'D', 'E', 'F'};
        int[] charFreq = {6, 9, 12, 15, 30, 45};

        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>(n, new MyComparator());

        for (int i = 0; i < n; i++) {
            HuffmanNode hn = new HuffmanNode(charFreq[i], charArray[i]);
            pq.add(hn);
        }

        HuffmanNode root = null;

        while (pq.size() > 1) {
            HuffmanNode x = pq.poll();
            HuffmanNode y = pq.poll();
            assert y != null;
            HuffmanNode newNode = new HuffmanNode(x.data + y.data, '-');
            newNode.left = x;
            newNode.right = y;
            root = newNode;
            pq.add(newNode);
        }

        assert root != null;
        printCodes(root, "");
    }
}


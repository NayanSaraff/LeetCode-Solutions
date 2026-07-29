/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;


    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node
bottomRight) { this.val = val; this.isLeaf = isLeaf; this.topLeft = topLeft; this.topRight =
topRight; this.bottomLeft = bottomLeft; this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid) {
        return helper(grid, 0, 0, grid.length);
    }
    private Node helper(int[][] grid, int row, int col, int size) {
        int value = grid[row][col];
        int flag = 1;
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (value != grid[i][j]) {
                    int half = size / 2;
                    Node TL = helper(grid, row, col, half);
                    Node TR = helper(grid, row, col + half, half);
                    Node BL = helper(grid, row + half, col, half);
                    Node BR = helper(grid, row + half, col + half, half);

                    return new Node(true, false, TL, TR, BL, BR);
                }
            }
        }
        if (value == 0)
            return new Node(false, true);
        else
            return new Node(true, true);
    }
}

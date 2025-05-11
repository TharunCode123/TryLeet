class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {  // outer row 
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) { // inner row
                if (j == 0 || j == i) {
                    row.add(1); // adding to a list
                } 
                else 
                {
                    int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(val); //adding to a list
                }
            }
            triangle.add(row); // adding the list to arraylist
        }
        return triangle;
    }
    }

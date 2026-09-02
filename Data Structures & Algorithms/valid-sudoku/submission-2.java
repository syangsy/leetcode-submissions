class Solution {
    public boolean isValidSudoku(char[][] board) {

        Map<String, HashSet<Character>> checkDuplicates = new HashMap<>();


        for(int i = 0; i < board.length; i++){

            for(int j = 0; j < board[i].length; j++){
                // to calculate the key for the subbox

                if(board[i][j] == '.')
                    continue;


                int x = j/3;
                int y = i/3;

                
                // check dups in row
                if(checkDuplicates.computeIfAbsent("r"+i, k -> new HashSet<Character>()).contains(board[i][j])){
                    System.out.println("row " + i + " board: " + board[i][j]);
                    return false;
                }

                else if(checkDuplicates.computeIfAbsent("c"+j, k -> new HashSet<Character>()).contains(board[i][j])){
                    System.out.println("col " + j);
                    return false;
                }
                else if(checkDuplicates.computeIfAbsent("r"+x+"c"+y, k -> new HashSet<Character>()).contains(board[i][j])){
                    System.out.println("row: " + x + " col: " + j);
                    return false;

                }
                else{
                    checkDuplicates.get("r"+i).add(board[i][j]);
                    checkDuplicates.get("c"+j).add(board[i][j]);
                    checkDuplicates.get("r"+x+"c"+y).add(board[i][j]);
                }

            }

        }

        return true;

        
    }
}

package com.mohit;

import java.util.HashMap;

public class Board {
    public HashMap<Integer, BoardEntity> cells;
    public int cellCount;

    public Board(int dimension) {
        this.cellCount = dimension*dimension;
        this.cells = new HashMap<Integer, BoardEntity>();

        for(int i=0;i<dimension;i++){
            int min = 2;
            int max = cellCount-1;

            //For assigning snakes equal to the dimensions
            int start = (int)Math.floor(Math.random()*(max-min+1)+min);

            max = start-1;
            int end = (int)Math.floor(Math.random()*(max-min+1)+min);

            if(!hasEntityHead(start)){
                setBoardEntity(start, new Snake(start,end));
            }

            //For assigning ladders equal to the dimensions
            max = cellCount-1;
            end = (int)Math.floor(Math.random()*(max-min+1)+min);

            max = end-1;
            start = (int)Math.floor(Math.random()*(max-min+1)+min);

            if(!hasEntityHead(start)){
                setBoardEntity(start, new Ladder(start, end));
            }
        }
    }

    private void setBoardEntity(int cellNumber, BoardEntity boardEntity){
        cells.put(cellNumber,boardEntity);
    }

    public BoardEntity getBoardEntity(int cellNumber){
        if(hasEntityHead(cellNumber)){
            return cells.get(cellNumber);
        }
        return null;
    }

    public boolean hasEntityHead(int cellNumber){
        return cells.containsKey(cellNumber);
    }

    public void printBoard(){
        for(int i=cellCount-1;i>0;i--){
            System.out.println(i+" ");

            if(hasEntityHead(i)){
                System.out.println(cells.get(i).getString());
            }else{
                System.out.println(" ");
            }

            if(i%10==0){
                System.out.println();
            }
        }
        System.out.println();
    }
}

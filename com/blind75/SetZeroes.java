package com.blind75;

public class SetZeroes {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

		setZeroes(matrix);
	}

	    public static void setZeroes(int[][] matrix) {
	        
	        
	        int m=matrix.length;
	        
	        int n= matrix[0].length;
	        
	        
	        boolean rowzero= false;
	        
	        //set forst column and row as zero
	        for(int rows=0;rows<m;rows++) {
	            
	            for(int cols =0;cols<n;cols++)
	            {
	              if(matrix[rows][cols]==0){
	                  
	                  matrix[0][cols]=0;
	                  
	                  if(rows>0){
	                	  //overlappingzone
	                      matrix[rows][0]=0;
	                  }else{
	                      rowzero=true;
	                  }
	                  
	              }  
	                
	            }      
	        
	        }   
	        
	        //set sub array to 0
	        for(int i=1;i<m;i++){
	            
	            for(int j=1;j<n;j++){
	                
	                if(matrix[0][j]==0 || matrix[i][0]==0) {
	                    
	                    matrix[i][j]=0;
	                }
	            }
	        }
	        
	        //set first row to zero
	        if(matrix[0][0]==0){
	            for(int rows=0;rows<m;rows++){
	                matrix[rows][0]=0;
	            }
	        }
	        
	        
	        //set first columns to zero
	        if(rowzero==true){
	            for(int cols=0;cols<n;cols++){
	                matrix[0][cols] =0;
	            }
	        }
	        
	    }
	}
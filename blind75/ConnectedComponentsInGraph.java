package com.blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectedComponentsInGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] edges = {{0,1},{1,2},{3,4}};
		
		
		System.out.println(countComponents(5,edges));
	}

	
	    public static int countComponents(int n, int[][] edges) {
	        
	        int components=0;
	        boolean  vis[] = new boolean[n];
	        
	    List<Integer>[] list = new ArrayList[n];
		
	        for(int i=0;i<n;i++){
	            
	            list[i]= new ArrayList<Integer>();
	        }
	        
	        for(int i=0;i<edges.length;i++){
	            
	            list[edges[i][0]].add(edges[i][1]);
	            

			    System.out.print("list "+
			    Arrays.asList(list));
			    
	            list[edges[i][1]].add(edges[i][0]);
	            

			    System.out.print("list "+
			    Arrays.asList(list));
	            
	        }
	        
		/*
		 * System.out.print("list "+ Arrays.asList(list));
		 */
		    
	        for(int i=0;i<n;i++){
	            if(vis[i]==false){
	                components++;
	                
	                dfs(i,vis,list);
	            }
	            
	            
	        }
	        return components;
	        
	    }
	    
	    private  static void dfs(int startnode, boolean[] vis, List<Integer>[] list){
	        
	        vis[startnode] = true;
	        
	        for(int i=0;i< list[startnode].size();i++){
	            
	            if(!(vis[list[startnode].get(i)])){
	                dfs(list[startnode].get(i),vis,list);
	            }
	        }
	    }
	    
	}

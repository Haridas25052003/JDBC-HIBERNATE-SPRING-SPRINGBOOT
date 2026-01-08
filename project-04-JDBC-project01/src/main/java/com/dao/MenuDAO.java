package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.MenuItem;
import com.util.DBConnection;

public class MenuDAO {
	
	/*
	 * purpose:
	 * fetch all available menu items
	 * return list of items
	 */
	public List<MenuItem> getAllAvailableItems(){
		
		List<MenuItem> menuList=new ArrayList<>();
		
		String sql="select * from menu_items where availability=true";
		
		try(Connection con=DBConnection.createConnection();
				PreparedStatement pst=con.prepareStatement(sql);
				ResultSet rs=pst.executeQuery();){
			
			while(rs.next()) {
				
				MenuItem item=new MenuItem();
				
				item.setItemId(rs.getInt("item_id"));
				item.setName(rs.getString("name"));
				item.setPrice(rs.getDouble("price"));
				item.setCategory(rs.getString("category"));
				item.setAvailability(rs.getBoolean("availability"));
				
				menuList.add(item);
			}
		}
			catch(SQLException e) {
				e.printStackTrace();
			}
			return menuList;
		}
	
	 
	public boolean updateAvailabitliy(int itemId, boolean availability) {
		
		int result=0;
		String sql="update menu_items set availability=? where item_Id=?";
		
		try(Connection con=DBConnection.createConnection();
				PreparedStatement pst=con.prepareStatement(sql);){
			
			pst.setBoolean(1,availability);
			pst.setInt(2, itemId);
			
			result=pst.executeUpdate();
			
			return result > 0;
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/*
	 * add menu 
	 */
	
	public boolean addMenuItem(MenuItem item) {
		
		String sql="insert into menu_items (name,price,category,availability) values (?,?,?,?)";
		
		try(Connection con=DBConnection.createConnection();
				PreparedStatement pst=con.prepareStatement(sql);){
			
			pst.setString(1, item.getName());
			pst.setDouble(2, item.getPrice());
			pst.setString(3, item.getCategory());
			pst.setBoolean(4, item.isAvailability());
			
			int rowsInserted = pst.executeUpdate();
			
			return rowsInserted > 0;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	

}

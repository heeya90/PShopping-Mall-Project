package model.service;


public class TEMP {
	
	public String select(String[] columns, String tableName , String where){
		String query=null;
		
		query="SELECT ";
		for(int i=0 ; i<columns.length ; i++){
			query+=columns[i];
			if(i<columns.length-1){
				query+=" , ";
			}
		}
		query+=" FROM "+tableName;
		query+=" WHERE "+where;
		
		/*for(int i=0 ; i<where.length ; i++){
			query+=where[i];
		}*/
		return query;
	}
	
	public static void main(String[] a){
		TEMP t = new TEMP();
		
		String[] columns = {"id", "pw", "name", "address", "phone"};
		String tableName = "t_admin";
		String where = "id=100";
		/// = {"id=parameterid", "and pw=parameterpw"};
		
		System.out.println(t.select(columns, tableName, where));
	}
}

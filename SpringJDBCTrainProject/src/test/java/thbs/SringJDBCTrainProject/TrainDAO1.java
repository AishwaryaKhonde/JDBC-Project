package thbs.SringJDBCTrainProject;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class TrainDAO1  implements CRUDOperations{
       private JdbcTemplate jdbcTemplate;
	
	public TrainDAO1(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	@Override
	public void insert(Train train) {
		
		if (null != train) {

         // Prepared statement in JDBC : insert statement below 			
			jdbcTemplate.update(
					"insert into trains values(?,?,?,?,?)",
					new Object[] {train.getTrain_no(),train.getTrain_name(),train.getSource_name(),
							train.getdestination(),train.getTicket_price()});
		
	}
		
	}
	
	
public List<Train> selectAll(){
		
		return	jdbcTemplate.query("select * from trains", new RowMapper<Train>() {
            // ResultSet rs = st.executeQuery("Select * from employee");
			
			
			@Override
			public Train mapRow(ResultSet resultSet, int arg1) throws SQLException {
				Train train = new Train();
				train.setTrain_no(resultSet.getInt(1));
				train.setTrain_name(resultSet.getString(2));
				train.setSource_name(resultSet.getString(3));
				train.setdestination(resultSet.getString(4));
				train.setTicket_price(resultSet.getInt(5));

				return train;
				

			}
		});
		}




			public Train select(int train_no) {
				return (Train) jdbcTemplate.queryForObject(
						"SELECT * FROM trains WHERE train_no=?",
						new Object[] { Integer.valueOf(train_no) },
						new RowMapper<Train>() {
			
							@Override
							public Train mapRow(ResultSet resultSet, int arg1)
									throws SQLException {
								Train train = new Train();
								train.setTrain_no(resultSet.getInt(1));
								train.setTrain_name(resultSet.getString(2));
								train.setSource_name(resultSet.getString(3));
								train.setdestination(resultSet.getString(4));
								train.setTicket_price(resultSet.getInt(5));
								return train;
							}
						});
}

}

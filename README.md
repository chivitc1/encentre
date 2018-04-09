# Use spring jdbctemplate for data access
- Declare JdbcTemplate bean which use dataSource bean
- Inject JdbcTemplate bean into Dao class
- Insert/udpate method1: jdbcTemplate.update() which use params of PrepareStatementCreator for set sql, and may be a String[] store key values the insert sql return. PSTM then use to set param value for place-holders ? in sql. A KeyHolder need to pass to update() as well to hold the keys.

- Query method1: use RowMapper<T> implementation to handle parsing resultset to model.

- Query method2: use BeanPropertyRowMapper.newInstance(YourModel.class) to parse resultset to model
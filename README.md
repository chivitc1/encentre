# Use spring NamedJdbcTemplate for data access
- JdbcTemplate use placeholder ? for passing parameters which the order of them are important.
- NamedJdbcTemplate use :a_name to improve readability
- Parameters can be provided by Map object

- Spring bean default use method produce bean as bean name
- We can use @Bean(name="aBeanName") to define bean name
- When multiple bean candidate satisfy an @Autowired => you should set @Qualifier("nameOfBeanToUse") if beans have different names (should name them differently)
- When bean of same type with same name exist, use @Primary on bean you want to use.

Eg:
	@Bean(name = "namedParameterJdbcTemplate")
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate(
			@Autowired @Qualifier("dbcpDataSource") DataSource dataSource)
	{
		return new NamedParameterJdbcTemplate(dataSource);
	}
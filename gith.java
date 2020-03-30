public class UomDaoImpl
{
	public List<Object[]> getUomTypeAndCount(){
		String sql="selec uomType,count(UomType) from uom.app.model.uom group by uomType";
		return (List<Object[]>)ht.find(hql);
}
@Component
public class UomUtil
{
	public void genPie(String path,List<Object[]> list){
		DefaultPieDataSet dataset=new DefaultPieDataSet();
		for
}

package xlsys.base.model;

import java.math.BigDecimal;

/**
 * This class is automatically generated by the program of Lewis.
 * @author Lewis
 *
 */
public class UIModuleModel implements ITableModel
{
	private static final long serialVersionUID = 4367986566378368840L;
	
	private BigDecimal uimid;
	private String name;
	private String defaultimpl;
	private BigDecimal platform;
	private BigDecimal type;

	protected UIModuleModel() {}

	public UIModuleModel(BigDecimal uimid)
	{
		this.uimid = uimid;
	}

	public BigDecimal getUimid()
	{
		return uimid;
	}

	protected void setUimid(BigDecimal uimid)
	{
		this.uimid = uimid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDefaultimpl()
	{
		return defaultimpl;
	}

	public void setDefaultimpl(String defaultimpl)
	{
		this.defaultimpl = defaultimpl;
	}

	public BigDecimal getPlatform()
	{
		return platform;
	}

	public void setPlatform(BigDecimal platform)
	{
		this.platform = platform;
	}

	public BigDecimal getType()
	{
		return type;
	}

	public void setType(BigDecimal type)
	{
		this.type = type;
	}

	@Override
	public String getRefTableName()
	{
		return "xlv2_uimodule";
	}
}
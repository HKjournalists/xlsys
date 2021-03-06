package xlsys.base.model;

import java.math.BigDecimal;

/**
 * This class is automatically generated by the program of Lewis.
 * @author Lewis
 *
 */
public class DialogModel implements ITableModel
{
	private static final long serialVersionUID = 3688031622567327978L;
	
	private BigDecimal dialogid;
	private String name;
	private String impl;

	protected DialogModel() {}

	public DialogModel(BigDecimal dialogid)
	{
		this.dialogid = dialogid;
	}

	public BigDecimal getDialogid()
	{
		return dialogid;
	}

	protected void setDialogid(BigDecimal dialogid)
	{
		this.dialogid = dialogid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getImpl()
	{
		return impl;
	}

	public void setImpl(String impl)
	{
		this.impl = impl;
	}

	@Override
	public String getRefTableName()
	{
		return "xlv2_dialog";
	}
}
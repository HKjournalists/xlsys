package xlsys.base.model;

import java.math.BigDecimal;
import xlsys.base.io.attachment.XlsysAttachment;
import java.util.List;
import java.util.ArrayList;

/**
 * This class is automatically generated by the program of Lewis.
 * @author Lewis
 *
 */
public class MenuModel implements ITableModel
{
	private static final long serialVersionUID = 2142963854731354040L;
	
	private String menuid;
	private String levelid;
	private BigDecimal platform;
	private String name;
	private BigDecimal type;
	private XlsysAttachment icon;
	private String iconurl;
	private String shortcut;
	private BigDecimal handlerid;
	private List<MenuRightModel> menuRightList;
	private List<MenuHandlerParamModel> menuHandlerParamList;

	protected MenuModel() {}

	public MenuModel(String menuid)
	{
		this.menuid = menuid;
	}

	public String getMenuid()
	{
		return menuid;
	}

	protected void setMenuid(String menuid)
	{
		this.menuid = menuid;
	}

	public String getLevelid()
	{
		return levelid;
	}

	public void setLevelid(String levelid)
	{
		this.levelid = levelid;
	}

	public BigDecimal getPlatform()
	{
		return platform;
	}

	public void setPlatform(BigDecimal platform)
	{
		this.platform = platform;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public BigDecimal getType()
	{
		return type;
	}

	public void setType(BigDecimal type)
	{
		this.type = type;
	}

	public XlsysAttachment getIcon()
	{
		return icon;
	}

	public void setIcon(XlsysAttachment icon)
	{
		this.icon = icon;
	}

	public String getIconurl()
	{
		return iconurl;
	}

	public void setIconurl(String iconurl)
	{
		this.iconurl = iconurl;
	}

	public String getShortcut()
	{
		return shortcut;
	}

	public void setShortcut(String shortcut)
	{
		this.shortcut = shortcut;
	}

	public BigDecimal getHandlerid()
	{
		return handlerid;
	}

	public void setHandlerid(BigDecimal handlerid)
	{
		this.handlerid = handlerid;
	}

	public List<MenuRightModel> getMenuRightList()
	{
		return menuRightList;
	}

	public void setMenuRightList(List<MenuRightModel> menuRightList)
	{
		this.menuRightList = menuRightList;
	}

	public void addMenuRight(MenuRightModel menuRight)
	{
		if(menuRightList==null) menuRightList = new ArrayList<MenuRightModel>();
		menuRightList.add(menuRight);
	}

	public List<MenuHandlerParamModel> getMenuHandlerParamList()
	{
		return menuHandlerParamList;
	}

	public void setMenuHandlerParamList(List<MenuHandlerParamModel> menuHandlerParamList)
	{
		this.menuHandlerParamList = menuHandlerParamList;
	}

	public void addMenuHandlerParam(MenuHandlerParamModel menuHandlerParam)
	{
		if(menuHandlerParamList==null) menuHandlerParamList = new ArrayList<MenuHandlerParamModel>();
		menuHandlerParamList.add(menuHandlerParam);
	}

	@Override
	public String getRefTableName()
	{
		return "xlv2_menu";
	}
}
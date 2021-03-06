/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/

package org.spin.process;

import java.sql.Timestamp;
import org.compiere.process.SvrProcess;

/** Generated Process for (Generate Withholding Declaration)
 *  @author ADempiere (generated) 
 *  @version Release 3.9.3
 */
public abstract class WithholdingDeclarationAbstract extends SvrProcess {
	/** Process Value 	*/
	private static final String VALUE_FOR_PROCESS = "SBP_WithholdingDeclaration";
	/** Process Name 	*/
	private static final String NAME_FOR_PROCESS = "Generate Withholding Declaration";
	/** Process Id 	*/
	private static final int ID_FOR_PROCESS = 54301;
	/**	Parameter Name for Document Date	*/
	public static final String DATEDOC = "DateDoc";
	/**	Parameter Name for Currency	*/
	public static final String C_CURRENCY_ID = "C_Currency_ID";
	/**	Parameter Value for Document Date	*/
	private Timestamp dateDoc;
	/**	Parameter Value for Currency	*/
	private int currencyId;

	@Override
	protected void prepare() {
		dateDoc = getParameterAsTimestamp(DATEDOC);
		currencyId = getParameterAsInt(C_CURRENCY_ID);
	}

	/**	 Getter Parameter Value for Document Date	*/
	protected Timestamp getDateDoc() {
		return dateDoc;
	}

	/**	 Setter Parameter Value for Document Date	*/
	protected void setDateDoc(Timestamp dateDoc) {
		this.dateDoc = dateDoc;
	}

	/**	 Getter Parameter Value for Currency	*/
	protected int getCurrencyId() {
		return currencyId;
	}

	/**	 Setter Parameter Value for Currency	*/
	protected void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}

	/**	 Getter Parameter Value for Process ID	*/
	public static final int getProcessId() {
		return ID_FOR_PROCESS;
	}

	/**	 Getter Parameter Value for Process Value	*/
	public static final String getProcessValue() {
		return VALUE_FOR_PROCESS;
	}

	/**	 Getter Parameter Value for Process Name	*/
	public static final String getProcessName() {
		return NAME_FOR_PROCESS;
	}
}
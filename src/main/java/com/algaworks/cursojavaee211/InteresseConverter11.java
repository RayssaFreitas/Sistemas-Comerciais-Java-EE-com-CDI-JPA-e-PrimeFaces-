package com.algaworks.cursojavaee211;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("interesse11")
public class InteresseConverter11 implements Converter {

	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		if (value != null) {
			for (Interesse11 interesse : PerfilUsuarioBean211.INTERESSES) {
				if (value.equals(interesse.getNomeIcone())) {
					return interesse;
				}
			}
		}
		return null;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null && !value.equals("")) {
			Interesse11 interesse = (Interesse11) value;
			return interesse.getNomeIcone();
		}
		return null;
	}

}

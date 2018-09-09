package com.algaworks.cursojavaee29;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("interesse")
public class InteresseConverter implements Converter {

	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		if (value != null) {
			for (Interesse interesse : PerfilUsuarioBean4.INTERESSES) {
				if (value.equals(interesse.getNomeIcone())) {
					return interesse;
				}
			}
		}
		return null;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null) {
			Interesse interesse = (Interesse) value;
			return interesse.getNomeIcone();
		}
		return null;
	}

}

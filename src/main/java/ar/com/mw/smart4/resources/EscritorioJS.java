package ar.com.mw.smart4.resources;

import ar.com.mw.smart4.SmartApplication;
import ar.com.mw.smart4.block.BlockUIResourceReference;
import org.apache.wicket.markup.head.HeaderItem;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.request.resource.JavaScriptResourceReference;

import java.util.ArrayList;
import java.util.List;

public class EscritorioJS extends JavaScriptResourceReference {

    public EscritorioJS() {
        super(EscritorioJS.class, "js/escritorio.js");
    }

    @Override
    public List<HeaderItem> getDependencies() {
        List<HeaderItem> items = new ArrayList<>();
        items.add(JavaScriptHeaderItem.forReference(SmartApplication.get().getJavaScriptLibrarySettings().getJQueryReference()));
        items.add(JavaScriptHeaderItem.forReference(new BoostrapJS()));
        items.add(JavaScriptHeaderItem.forReference(new BlockUIResourceReference()));
        return items;
    }
}

package com.ippon.formation.gwt.client.ui.widget;

import java.util.Date;

import com.google.gwt.cell.client.DateCell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.SimplePager.TextLocation;
import com.google.gwt.view.client.MultiSelectionModel;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SelectionModel;
import com.ippon.formation.gwt.client.ui.resources.ApplicationResources;
import com.ippon.formation.gwt.shared.domain.entities.Player;

public class PlayersTable extends CellTable<Player> {

    public PlayersTable() {
        // Create a CellTable.
        this.setWidth("100%", true);

        // Do not refresh the headers and footers every time the data is updated.
        this.setAutoHeaderRefreshDisabled(true);
        this.setAutoFooterRefreshDisabled(true);

        // Create a Pager to control the table.
        SimplePager.Resources pagerResources = GWT.create(SimplePager.Resources.class);
        SimplePager pager = new SimplePager(TextLocation.CENTER, pagerResources, false, 0, true);
        pager.setDisplay(this);

        // Add a selection model so we can select cells.
        final SelectionModel<Player> selectionModel = new MultiSelectionModel<Player>(KEY_PROVIDER);
        this.setSelectionModel(selectionModel);

        this.setLoadingIndicator(new LoadingPanel());

        // Initialize the columns.
        initTableColumns();
    }

    /**
     * Add the columns to the table.
     */
    private void initTableColumns() {

        Column<Player, String> nameColumn = new Column<Player, String>(new TextCell()) {
            @Override
            public String getValue(Player object) {
                // Get the value from the selection model.
                return object.getName();
            }
        };
        this.addColumn(nameColumn, ApplicationResources.getMessages().cell_player_name());

        Column<Player, Date> birthDayColumn = new Column<Player, Date>(new DateCell(
                DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_FULL))) {
            @Override
            public Date getValue(Player object) {
                // Get the value from the selection model.
                return object.getBirthDay();
            }
        };
        this.addColumn(birthDayColumn, ApplicationResources.getMessages().cell_player_birthday());
    }

    /**
     * The key provider that provides the unique ID of a contact.
     */
    public static final ProvidesKey<Player> KEY_PROVIDER = new ProvidesKey<Player>() {
        @Override
        public Object getKey(Player item) {
            return item == null ? null : item.getName();
        }
    };
}

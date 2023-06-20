package net.mackenziemolloy.shopguiplus.sellgui.utility;

import net.mackenziemolloy.shopguiplus.sellgui.SellGUI;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class LogFormatter extends Formatter {

  private final DateFormat dateFormat = new SimpleDateFormat(SellGUI.getInstance().getConfiguration().getString("options.date_format"));

  @Override
  public String format(LogRecord logRecord) {
    return getDateAndTime() + " " + logRecord.getMessage() + "\n";
  }

  private String getDateAndTime() {
    Date date = new Date();
    return dateFormat.format(date);
  }
}

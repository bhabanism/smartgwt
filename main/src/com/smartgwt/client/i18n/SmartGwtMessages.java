package com.smartgwt.client.i18n;

/**
 * Interface to represent the messages contained in resource bundle:
 * 	/Users/sjivan/java/smartgwt-svn/trunk/main/src/com/smartgwt/client/i18n/SmartGwtMessages.properties'.
 */
public interface SmartGwtMessages extends com.google.gwt.i18n.client.Messages {

  /**
   * Translated "Upload".
   * 
   * @return translated "Upload"
   */
  @DefaultMessage("Upload")
  @Key("batchUploader_uploadButtonTitle")
  String batchUploader_uploadButtonTitle();

  /**
   * Translated "Upload File".
   * 
   * @return translated "Upload File"
   */
  @DefaultMessage("Upload File")
  @Key("batchUploader_uploadFileLabel")
  String batchUploader_uploadFileLabel();

  /**
   * Translated "Records added".
   * 
   * @return translated "Records added"
   */
  @DefaultMessage("Records added")
  @Key("batchUploader_commitConfirmationMessage")
  String batchUploader_commitConfirmationMessage();
  
  /**
   * Translated "The following columns in your imported data were ignored because they did not match any of the expected column names: $discardedColumns".
   * 
   * @return translated "The following columns in your imported data were ignored because they did not match any of the expected column names: $discardedColumns"
   */
  @DefaultMessage("The following columns in your imported data were ignored because they did not match any of the expected column names: $discardedColumns")
  @Key("batchUploader_discardedColumnsMessage")
  String batchUploader_discardedColumnsMessage();

  /**
   * Translated "Either enter valid criteria or hit ''Cancel'' to abandon changes.".
   * 
   * @return translated "Either enter valid criteria or hit ''Cancel'' to abandon changes."
   */
  @DefaultMessage("Either enter valid criteria or hit ''Cancel'' to abandon changes.")
  @Key("advancedHiliteEditor_invalidCriteriaPrompt")
  String advancedHiliteEditor_invalidCriteriaPrompt();

  /**
   * Translated "Untitled Button".
   * 
   * @return translated "Untitled Button"
   */
  @DefaultMessage("Untitled Button")
  @Key("button_title")
  String button_title();

  /**
   * Translated "Add an event".
   * 
   * @return translated "Add an event"
   */
  @DefaultMessage("Add an event")
  @Key("calendar_addEventButtonHoverText")
  String calendar_addEventButtonHoverText();

  /**
   * Translated "Cancel".
   * 
   * @return translated "Cancel"
   */
  @DefaultMessage("Cancel")
  @Key("calendar_cancelButtonTitle")
  String calendar_cancelButtonTitle();

  /**
   * Translated "Choose a date".
   * 
   * @return translated "Choose a date"
   */
  @DefaultMessage("Choose a date")
  @Key("calendar_datePickerHoverText")
  String calendar_datePickerHoverText();

  /**
   * Translated "Day".
   * 
   * @return translated "Day"
   */
  @DefaultMessage("Day")
  @Key("calendar_dayViewTitle")
  String calendar_dayViewTitle();

  /**
   * Translated "Edit Details".
   * 
   * @return translated "Edit Details"
   */
  @DefaultMessage("Edit Details")
  @Key("calendar_detailsButtonTitle")
  String calendar_detailsButtonTitle();

  /**
   * Translated "Remove Event".
   * 
   * @return translated "Remove Event"
   */
  @DefaultMessage("Remove Event")
  @Key("calendar_removeButtonTitle")
  String calendar_removeButtonTitle();

  /**
   * Translated "Event Name".
   * 
   * @return translated "Event Name"
   */
  @DefaultMessage("Event Name")
  @Key("calendar_eventNameFieldTitle")
  String calendar_eventNameFieldTitle();

  /**
   * Translated "Description".
   * 
   * @return translated "Description"
   */
  @DefaultMessage("Description")
  @Key("calendar_eventDescriptionFieldTitle")
  String calendar_eventDescriptionFieldTitle();

  /**
   * Translated "From".
   * 
   * @return translated "From"
   */
  @DefaultMessage("From")
  @Key("calendar_eventStartDateFieldTitle")
  String calendar_eventStartDateFieldTitle();

  /**
   * Translated "To".
   * 
   * @return translated "To"
   */
  @DefaultMessage("To")
  @Key("calendar_eventEndDateFieldTitle")
  String calendar_eventEndDateFieldTitle();

  /**
   * Translated "Lane".
   * 
   * @return translated "Lane"
   */
  @DefaultMessage("Lane")
  @Key("calendar_eventLaneFieldTitle")
  String calendar_eventLaneFieldTitle();

  /**
   * Translated "From must be before To".
   * 
   * @return translated "From must be before To"
   */
  @DefaultMessage("From must be before To")
  @Key("calendar_invalidDateMessage")
  String calendar_invalidDateMessage();

  /**
   * Translated "Month".
   * 
   * @return translated "Month"
   */
  @DefaultMessage("Month")
  @Key("calendar_monthViewTitle")
  String calendar_monthViewTitle();

  /**
   * Translated "Next".
   * 
   * @return translated "Next"
   */
  @DefaultMessage("Next")
  @Key("calendar_nextButtonHoverText")
  String calendar_nextButtonHoverText();

  /**
   * Translated "Previous".
   * 
   * @return translated "Previous"
   */
  @DefaultMessage("Previous")
  @Key("calendar_previousButtonHoverText")
  String calendar_previousButtonHoverText();

  /**
   * Translated "Save Event".
   * 
   * @return translated "Save Event"
   */
  @DefaultMessage("Save Event")
  @Key("calendar_saveButtonTitle")
  String calendar_saveButtonTitle();

  /**
   * Translated "Timeline".
   * 
   * @return translated "Timeline"
   */
  @DefaultMessage("Timeline")
  @Key("calendar_timelineViewTitle")
  String calendar_timelineViewTitle();

  /**
   * Translated "Week".
   * 
   * @return translated "Week"
   */
  @DefaultMessage("Week")
  @Key("calendar_weekViewTitle")
  String calendar_weekViewTitle();


  /**
   * Translated "Week".
   * 
   * @return translated "Week"
   */
  @DefaultMessage("Week")
  @Key("calendar_weekPrefix")
  String calendar_weekPrefix();


  /**
   * Translated "< $monthName".
   * 
   * @return translated "< $monthName"
   */
  @DefaultMessage("< $monthName")
  @Key("calendar_monthButtonTitle")
  String calendar_monthButtonTitle();

  
  /**
   * Translated "Back".
   * 
   * @return translated "Back"
   */
  @DefaultMessage("Back")
  @Key("calendar_backButtonTitle")
  String calendar_backButtonTitle();

  /**
   * Translated "Sublane".
   * 
   * @return translated "Sublane"
   */
  @DefaultMessage("Sublane")
  @Key("calendar_eventSublaneFieldTitle")
  String calendar_eventSublaneFieldTitle();
  
  /**
   * Translated "Duration".
   * 
   * @return translated "Duration"
   */
  @DefaultMessage("Duration")
  @Key("calendar_eventDurationFieldTitle")
  String calendar_eventDurationFieldTitle();

  /**
   * Translated "&nbsp".
   * 
   * @return translated "&nbsp"
   */
  @DefaultMessage("&nbsp")
  @Key("calendar_eventDurationUnitFieldTitle")
  String calendar_eventDurationUnitFieldTitle();

  /**
   * Translated "Loading...".
   * 
   * @return translated "Loading"
   */
  @DefaultMessage("Loading...")
  @Key("formItem_loadingDisplayValue")
  String formItem_loadingDisplayValue();

  /**
   * Translated "Click to select a new color".
   * 
   * @return translated "Click to select a new color"
   */
  @DefaultMessage("Click to select a new color")
  @Key("colorItem_pickerIconPrompt")
  String colorItem_pickerIconPrompt();

  /**
   * Translated "Basic Colors:".
   * 
   * @return translated "Basic Colors:"
   */
  @DefaultMessage("Basic Colors:")
  @Key("colorPicker_basicColorLabel")
  String colorPicker_basicColorLabel();

  /**
   * Translated "The Blue component of the selected color".
   * 
   * @return translated "The Blue component of the selected color"
   */
  @DefaultMessage("The Blue component of the selected color")
  @Key("colorPicker_blueFieldPrompt")
  String colorPicker_blueFieldPrompt();

  /**
   * Translated "Blue".
   * 
   * @return translated "Blue"
   */
  @DefaultMessage("Blue")
  @Key("colorPicker_blueFieldTitle")
  String colorPicker_blueFieldTitle();

  /**
   * Translated "Cancel".
   * 
   * @return translated "Cancel"
   */
  @DefaultMessage("Cancel")
  @Key("colorPicker_cancelButtonTitle")
  String colorPicker_cancelButtonTitle();

  /**
   * Translated "The Green component of the selected color".
   * 
   * @return translated "The Green component of the selected color"
   */
  @DefaultMessage("The Green component of the selected color")
  @Key("colorPicker_greenFieldPrompt")
  String colorPicker_greenFieldPrompt();

  /**
   * Translated "Green".
   * 
   * @return translated "Green"
   */
  @DefaultMessage("Green")
  @Key("colorPicker_greenFieldTitle")
  String colorPicker_greenFieldTitle();

  /**
   * Translated "The selected color''s HTML coding".
   * 
   * @return translated "The selected color''s HTML coding"
   */
  @DefaultMessage("The selected color''s HTML coding")
  @Key("colorPicker_htmlFieldPrompt")
  String colorPicker_htmlFieldPrompt();

  /**
   * Translated "HTML".
   * 
   * @return translated "HTML"
   */
  @DefaultMessage("HTML")
  @Key("colorPicker_htmlFieldTitle")
  String colorPicker_htmlFieldTitle();

  /**
   * Translated "The Hue (base tone) of the selected color".
   * 
   * @return translated "The Hue (base tone) of the selected color"
   */
  @DefaultMessage("The Hue (base tone) of the selected color")
  @Key("colorPicker_hueFieldPrompt")
  String colorPicker_hueFieldPrompt();

  /**
   * Translated "Hue".
   * 
   * @return translated "Hue"
   */
  @DefaultMessage("Hue")
  @Key("colorPicker_hueFieldTitle")
  String colorPicker_hueFieldTitle();

  /**
   * Translated "<< Less".
   * 
   * @return translated "<< Less"
   */
  @DefaultMessage("<< Less")
  @Key("colorPicker_lessButtonTitle")
  String colorPicker_lessButtonTitle();

  /**
   * Translated "The Luminosity (brightness) of the selected color".
   * 
   * @return translated "The Luminosity (brightness) of the selected color"
   */
  @DefaultMessage("The Luminosity (brightness) of the selected color")
  @Key("colorPicker_lumFieldPrompt")
  String colorPicker_lumFieldPrompt();

  /**
   * Translated "Lum".
   * 
   * @return translated "Lum"
   */
  @DefaultMessage("Lum")
  @Key("colorPicker_lumFieldTitle")
  String colorPicker_lumFieldTitle();

  /**
   * Translated "More >>".
   * 
   * @return translated "More >>"
   */
  @DefaultMessage("More >>")
  @Key("colorPicker_moreButtonTitle")
  String colorPicker_moreButtonTitle();

  /**
   * Translated "OK".
   * 
   * @return translated "OK"
   */
  @DefaultMessage("OK")
  @Key("colorPicker_okButtonTitle")
  String colorPicker_okButtonTitle();

  /**
   * Translated "Opacity:".
   * 
   * @return translated "Opacity:"
   */
  @DefaultMessage("Opacity:")
  @Key("colorPicker_opacitySliderLabel")
  String colorPicker_opacitySliderLabel();

  /**
   * Translated "The Red component of the selected color".
   * 
   * @return translated "The Red component of the selected color"
   */
  @DefaultMessage("The Red component of the selected color")
  @Key("colorPicker_redFieldPrompt")
  String colorPicker_redFieldPrompt();

  /**
   * Translated "Red".
   * 
   * @return translated "Red"
   */
  @DefaultMessage("Red")
  @Key("colorPicker_redFieldTitle")
  String colorPicker_redFieldTitle();

  /**
   * Translated "The Saturation (color purity) of the selected color".
   * 
   * @return translated "The Saturation (color purity) of the selected color"
   */
  @DefaultMessage("The Saturation (color purity) of the selected color")
  @Key("colorPicker_satFieldPrompt")
  String colorPicker_satFieldPrompt();

  /**
   * Translated "Sat".
   * 
   * @return translated "Sat"
   */
  @DefaultMessage("Sat")
  @Key("colorPicker_satFieldTitle")
  String colorPicker_satFieldTitle();

  /**
   * Translated "Select a Color".
   * 
   * @return translated "Select a Color"
   */
  @DefaultMessage("Select a Color")
  @Key("colorPicker_selectTitle")
  String colorPicker_selectTitle();

  /**
   * Translated "Selected Color:".
   * 
   * @return translated "Selected Color:"
   */
  @DefaultMessage("Selected Color:")
  @Key("colorPicker_selectedColorLabel")
  String colorPicker_selectedColorLabel();

  /**
   * Translated "Add formula column...".
   * 
   * @return translated "Add formula column..."
   */
  @DefaultMessage("Add formula column...")
  @Key("dataBoundComponent_addFormulaFieldText")
  String dataBoundComponent_addFormulaFieldText();

  /**
   * Translated "Add summary column...".
   * 
   * @return translated "Add summary column..."
   */
  @DefaultMessage("Add summary column...")
  @Key("dataBoundComponent_addSummaryFieldText")
  String dataBoundComponent_addSummaryFieldText();

  /**
   * Translated "Duplicates not allowed".
   * 
   * @return translated "Duplicates not allowed"
   */
  @DefaultMessage("Duplicates not allowed")
  @Key("dataBoundComponent_duplicateDragMessage")
  String dataBoundComponent_duplicateDragMessage();

  /**
   * Translated "Edit formula...".
   * 
   * @return translated "Edit formula..."
   */
  @DefaultMessage("Edit formula...")
  @Key("dataBoundComponent_editFormulaFieldText")
  String dataBoundComponent_editFormulaFieldText();

  /**
   * Translated "Edit summary format...".
   * 
   * @return translated "Edit summary format..."
   */
  @DefaultMessage("Edit summary format...")
  @Key("dataBoundComponent_editSummaryFieldText")
  String dataBoundComponent_editSummaryFieldText();

  /**
   * Translated "This data not available while offline.".
   * 
   * @return translated "This data not available while offline."
   */
  @DefaultMessage("This data not available while offline.")
  @Key("dataBoundComponent_offlineMessage")
  String dataBoundComponent_offlineMessage();

  /**
   * Translated "Remove formula".
   * 
   * @return translated "Remove formula"
   */
  @DefaultMessage("Remove formula")
  @Key("dataBoundComponent_removeFormulaFieldText")
  String dataBoundComponent_removeFormulaFieldText();

  /**
   * Translated "Remove summary column..".
   * 
   * @return translated "Remove summary column.."
   */
  @DefaultMessage("Remove summary column..")
  @Key("dataBoundComponent_removeSummaryFieldText")
  String dataBoundComponent_removeSummaryFieldText();

  /**
   * Translated "Field is required".
   * 
   * @return translated "Field is required"
   */
  @DefaultMessage("Field is required")
  @Key("dataBoundComponent_requiredFieldMessage")
  String dataBoundComponent_requiredFieldMessage();

  /**
   * Translated "Invalid value".
   * 
   * @return translated "Invalid value"
   */
  @DefaultMessage("Invalid value")
  @Key("dataBoundComponent_unknownErrorMessage")
  String dataBoundComponent_unknownErrorMessage();

  /**
   * Translated "Edit Highlights".
   * 
   * @return translated "Edit Highlights"
   */
  @DefaultMessage("Edit Highlights")
  @Key("dataBoundComponent_editHilitesDialogTitle")
  String dataBoundComponent_editHilitesDialogTitle();

  /**
   * Translated "Data cannot be saved because you are not online".
   * 
   * @return translated "Data cannot be saved because you are not online"
   */
  @DefaultMessage("Data cannot be saved because you are not online")
  @Key("dataBoundComponent_offlineSaveMessage")
  String dataBoundComponent_offlineSaveMessage();

  /**
   * Translated "You are attempting to export an empty dataset".
   * 
   * @return translated "You are attempting to export an empty dataset"
   */
  @DefaultMessage("You are attempting to export an empty dataset")
  @Key("dataBoundComponent_emptyExportMessage")
  String dataBoundComponent_emptyExportMessage();
  
  
  /**
   * Translated "Edit Highlights...".
   * 
   * @return translated "Edit Highlights..."
   */
  @DefaultMessage("Edit Highlights...")
  @Key("dataBoundComponent_editHilitesText")
  String dataBoundComponent_editHilitesText();

  /**
   * Translated "This data not available while offline".
   * 
   * @return translated "This data not available while offline"
   */
  @DefaultMessage("This data not available while offline")
  @Key("dataSource_offlineMessage")
  String dataSource_offlineMessage();

  /**
   * Translated "Size of ''$uploadedFileName'' ($uploadedFileSize) exceeded maximum allowed file size of $maxFileSize".
   * 
   * @return translated "Size of ''$uploadedFileName'' ($uploadedFileSize) exceeded maximum allowed file size of $maxFileSize"
   */
  @DefaultMessage("Size of ''$uploadedFileName'' ($uploadedFileSize) exceeded maximum allowed file size of $maxFileSize")
  @Key("dataSource_maxFileSizeExceededMessage")
  String dataSource_maxFileSizeExceededMessage();

  /**
   * Translated "Configure Fields...".
   * 
   * @return translated "Configure Fields..."
   */
  @DefaultMessage("Configure Fields...")
  @Key("detailViewer_configureFieldsText")
  String detailViewer_configureFieldsText();

  /**
   * Translated "Regression Lines".
   * 
   * @return translated "Regression Lines"
   */
  @DefaultMessage("Regression Lines")
  @Key("facetChart_regressionLinesContextMenuItemTitle")
  String facetChart_regressionLinesContextMenuItemTitle();

  /**
   * Translated "None".
   * 
   * @return translated "None"
   */
  @DefaultMessage("None")
  @Key("facetChart_hideRegressionLinesContextMenuItemTitle")
  String facetChart_hideRegressionLinesContextMenuItemTitle();

  /**
   * Translated "Straight Line".
   * 
   * @return translated "Straight Line"
   */
  @DefaultMessage("Straight Line")
  @Key("facetChart_linearRegressionLinesContextMenuItemTitle")
  String facetChart_linearRegressionLinesContextMenuItemTitle();

  /**
   * Translated "Polynomial Curve".
   * 
   * @return translated "Polynomial Curve"
   */
  @DefaultMessage("Polynomial Curve")
  @Key("facetChart_polynomialRegressionLinesContextMenuItemTitle")
  String facetChart_polynomialRegressionLinesContextMenuItemTitle();

  /**
   * Translated "Polynomial Degree...".
   * 
   * @return translated "Polynomial Degree..."
   */
  @DefaultMessage("Polynomial Degree...")
  @Key("facetChart_polynomialDegreeRegressionLinesContextMenuItemTitle")
  String facetChart_polynomialDegreeRegressionLinesContextMenuItemTitle();

  /**
   * Translated "Enter a degree for the polynomial regression curve (must be a positive integer):".
   * 
   * @return translated "Enter a degree for the polynomial regression curve (must be a positive integer):"
   */
  @DefaultMessage("Enter a degree for the polynomial regression curve (must be a positive integer):")
  @Key("facetChart_polynomialDegreePrompt")
  String facetChart_polynomialDegreePrompt();

  /**
   * Translated "The regression polynomial degree must be a positive integer.".
   * 
   * @return translated "The regression polynomial degree must be a positive integer."
   */
  @DefaultMessage("The regression polynomial degree must be a positive integer.")
  @Key("facetChart_invalidPolynomialDegreeMessage")
  String facetChart_invalidPolynomialDegreeMessage();
  
  /**
   * Translated "Proportional".
   * 
   * @return translated "Proportional"
   */
  @DefaultMessage("Proportional")
  @Key("facetChart_proportionalContextMenuItemTitle")
  String facetChart_proportionalContextMenuItemTitle();

  /**
   * Translated "No tiles to show.".
   * 
   * @return translated "No tiles to show."
   */
  @DefaultMessage("No tiles to show.")
  @Key("tileGrid_emptyMessage")
  String tileGrid_emptyMessage();

  /**
   * Translated "checked".
   * 
   * @return translated "checked"
   */
  @DefaultMessage("checked")
  @Key("checkboxItem_checkedDescription")
  String checkboxItem_checkedDescription();

  /**
   * Translated "unchecked".
   * 
   * @return translated "unchecked"
   */
  @DefaultMessage("unchecked")
  @Key("checkboxItem_uncheckedDescription")
  String checkboxItem_uncheckedDescription();

  /**
   * Translated "partially selected".
   * 
   * @return translated "partially selected"
   */
  @DefaultMessage("partially selected")
  @Key("checkboxItem_partialSelectedDescription")
  String checkboxItem_partialSelectedDescription();

  /**
   * Translated "unset".
   * 
   * @return translated "unset"
   */
  @DefaultMessage("unset")
  @Key("checkboxItem_unsetDescription")
  String checkboxItem_unsetDescription();

  /**
   * Translated "Cancel".
   * 
   * @return translated "Cancel"
   */
  @DefaultMessage("Cancel")
  @Key("dateChooser_cancelButtonTitle")
  String dateChooser_cancelButtonTitle();

  /**
   * Translated "Apply".
   * 
   * @return translated "Apply"
   */
  @DefaultMessage("Apply")
  @Key("dateChooser_applyButtonTitle")
  String dateChooser_applyButtonTitle();

  /**
   * Translated "0".
   * 
   * @return translated "0"
   */
  @DefaultMessage("0")
  @Key("dateChooser_firstDayOfWeek")
  String dateChooser_firstDayOfWeek();

  /**
   * Translated "Today".
   * 
   * @return translated "Today"
   */
  @DefaultMessage("Today")
  @Key("dateChooser_todayButtonTitle")
  String dateChooser_todayButtonTitle();

  /**
   * Translated "Year".
   * 
   * @return translated "Year"
   */
  @DefaultMessage("Year")
  @Key("dateChooser_fiscalYearFieldTitle")
  String dateChooser_fiscalYearFieldTitle();
  
  /**
   * Translated "Wk".
   * 
   * @return translated "Wk"
   */
  @DefaultMessage("Wk")
  @Key("dateChooser_weekFieldTitle")
  String dateChooser_weekFieldTitle();

  /**
   * Translated "Time".
   * 
   * @return translated "Time"
   */
  @DefaultMessage("Time")
  @Key("dateChooser_timeItemTitle")
  String dateChooser_timeItemTitle();

  /**
   * Translated "Choose a day".
   * 
   * @return translated "Choose a day"
   */
  @DefaultMessage("Choose a day")
  @Key("dateItem_daySelectorPrompt")
  String dateItem_daySelectorPrompt();

  /**
   * Translated "Invalid date".
   * 
   * @return translated "Invalid date"
   */
  @DefaultMessage("Invalid date")
  @Key("dateItem_invalidDateStringMessage")
  String dateItem_invalidDateStringMessage();

  /**
   * Translated "Choose a month".
   * 
   * @return translated "Choose a month"
   */
  @DefaultMessage("Choose a month")
  @Key("dateItem_monthSelectorPrompt")
  String dateItem_monthSelectorPrompt();

  /**
   * Translated "Show Date Chooser".
   * 
   * @return translated "Show Date Chooser"
   */
  @DefaultMessage("Show Date Chooser")
  @Key("dateItem_pickerIconPrompt")
  String dateItem_pickerIconPrompt();

  /**
   * Translated "MDY".
   * 
   * @return translated "MDY"
   */
  @DefaultMessage("MDY")
  @Key("dateItem_selectorFormat")
  String dateItem_selectorFormat();

  /**
   * Translated "Choose a year".
   * 
   * @return translated "Choose a year"
   */
  @DefaultMessage("Choose a year")
  @Key("dateItem_yearSelectorPrompt")
  String dateItem_yearSelectorPrompt();

  /**
   * Translated "Hour".
   * 
   * @return translated "Hour"
   */
  @DefaultMessage("Hour")
  @Key("timeItem_hourItemTitle")
  String timeItem_hourItemTitle();

  /**
   * Translated "Choose hours".
   * 
   * @return translated "Choose hours"
   */
  @DefaultMessage("Choose hours")
  @Key("timeItem_hourItemPrompt")
  String timeItem_hourItemPrompt();

  /**
   * Translated "Min".
   * 
   * @return translated "Min"
   */
  @DefaultMessage("Min")
  @Key("timeItem_minuteItemTitle")
  String timeItem_minuteItemTitle();

  /**
   * Translated "Choose minutes".
   * 
   * @return translated "Choose minutes"
   */
  @DefaultMessage("Choose minutes")
  @Key("timeItem_minuteItemPrompt")
  String timeItem_minuteItemPrompt();

  /**
   * Translated "Sec".
   * 
   * @return translated "Sec"
   */
  @DefaultMessage("Sec")
  @Key("timeItem_secondItemTitle")
  String timeItem_secondItemTitle();

  /**
   * Translated "Choose seconds".
   * 
   * @return translated "Choose seconds"
   */
  @DefaultMessage("Choose seconds")
  @Key("timeItem_secondItemPrompt")
  String timeItem_secondItemPrompt();

  /**
   * Translated "Ms".
   * 
   * @return translated "Ms"
   */
  @DefaultMessage("Ms")
  @Key("timeItem_millisecondItemTitle")
  String timeItem_millisecondItemTitle();

  /**
   * Translated "Choose milliseconds".
   * 
   * @return translated "Choose milliseconds"
   */
  @DefaultMessage("Choose milliseconds")
  @Key("timeItem_millisecondItemPrompt")
  String timeItem_millisecondItemPrompt();

  /**
   * Translated "AM/PM".
   * 
   * @return translated "AM/PM"
   */
  @DefaultMessage("AM/PM")
  @Key("timeItem_ampmItemTitle")
  String timeItem_ampmItemTitle();

  /**
   * Translated "AM/PM".
   * 
   * @return translated "AM/PM"
   */
  @DefaultMessage("AM/PM")
  @Key("timeItem_ampmItemPrompt")
  String timeItem_ampmItemPrompt();

  /**
   * Translated "Invalid time".
   * 
   * @return translated "Invalid time"
   */
  @DefaultMessage("Invalid time")
  @Key("timeItem_invalidTimeStringMessage")
  String timeItem_invalidTimeStringMessage();

  /**
   * Translated "Cancel".
   * 
   * @return translated "Cancel"
   */
  @DefaultMessage("Cancel")
  @Key("dateRangeDialog_cancelButtonTitle")
  String dateRangeDialog_cancelButtonTitle();

  /**
   * Translated "Clear".
   * 
   * @return translated "Clear"
   */
  @DefaultMessage("Clear")
  @Key("dateRangeDialog_clearButtonTitle")
  String dateRangeDialog_clearButtonTitle();

  /**
   * Translated "Select Date Range".
   * 
   * @return translated "Select Date Range"
   */
  @DefaultMessage("Select Date Range")
  @Key("dateRangeDialog_headerTitle")
  String dateRangeDialog_headerTitle();

  /**
   * Translated "OK".
   * 
   * @return translated "OK"
   */
  @DefaultMessage("OK")
  @Key("dateRangeDialog_okButtonTitle")
  String dateRangeDialog_okButtonTitle();

  /**
   * Translated "From".
   * 
   * @return translated "From"
   */
  @DefaultMessage("From")
  @Key("dateRangeItem_fromTitle")
  String dateRangeItem_fromTitle();

  /**
   * Translated "To".
   * 
   * @return translated "To"
   */
  @DefaultMessage("To")
  @Key("dateRangeItem_toTitle")
  String dateRangeItem_toTitle();

  /**
   * Translated "''To'' field value cannot be earlier than ''From'' field value.".
   * 
   * @return translated "''To'' field value cannot be earlier than ''From'' field value."
   */
  @DefaultMessage("''To'' field value cannot be earlier than ''From'' field value.")
  @Key("dateRangeItem_invalidRangeErrorMessage")
  String dateRangeItem_invalidRangeErrorMessage();

  /**
   * Translated "$".
   * 
   * @return translated "$"
   */
  @DefaultMessage("$")
  @Key("numberUtil_currencySymbol")
  String numberUtil_currencySymbol();

  /**
   * Translated ",".
   * 
   * @return translated ","
   */
  @DefaultMessage(",")
  @Key("numberUtil_groupingSymbol")
  String numberUtil_groupingSymbol();
  
  /**
   * Translated ".".
   * 
   * @return translated "."
   */
  @DefaultMessage(".")
  @Key("numberUtil_decimalSymbol")
  String numberUtil_decimalSymbol();
  
  /**
   * Translated "-".
   * 
   * @return translated "-"
   */
  @DefaultMessage("-")
  @Key("numberUtil_negativeSymbol")
  String numberUtil_negativeSymbol();

  /**
   * Translated "/".
   * 
   * @return translated "/"
   */
  @DefaultMessage("/")
  @Key("date_dateSeparator")
  String date_dateSeparator();

  /**
   * Translated "toUSShortDate".
   * 
   * @return translated "toUSShortDate"
   */
  @DefaultMessage("toUSShortDate")
  @Key("date_shortDateFormat")
  String date_shortDateFormat();

  /**
   * Translated "toUSShortDatetime".
   * 
   * @return translated "toUSShortDatetime"
   */
  @DefaultMessage("toUSShortDatetime")
  @Key("date_shortDatetimeFormat")
  String date_shortDatetimeFormat();

  /**
   * Translated "toLocaleString".
   * 
   * @return translated "toLocaleString"
   */
  @DefaultMessage("toLocaleString")
  @Key("date_normalDateFormat")
  String date_normalDateFormat();

  /**
   * Translated "toLocaleString".
   * 
   * @return translated "toLocaleString"
   */
  @DefaultMessage("toLocaleString")
  @Key("date_normalDatetimeFormat")
  String date_normalDatetimeFormat();

  /**
   * Translated "MDY".
   * 
   * @return translated "MDY"
   */
  // NOTE: Return an empty string because locales do not normally override this. Thus, for
  // any locale that does not specify a date_inputFormat value (e.g. ru_RU), this default
  // value is inherited.
  //
  // Use an empty string for the default value so that I18nUtil.initMessages() will not set
  // the Date.inputFormat to something inconsistent with the short date format, which many
  // locales do specify.
  @DefaultMessage("MDY")
  @Key("date_inputFormat")
  String date_inputFormat();

  /**
   * Translated "Sunday".
   * 
   * @return translated "Sunday"
   */
  @DefaultMessage("Sunday")
  @Key("date_dayNames_1")
  String date_dayNames_1();

  /**
   * Translated "Monday".
   * 
   * @return translated "Monday"
   */
  @DefaultMessage("Monday")
  @Key("date_dayNames_2")
  String date_dayNames_2();

  /**
   * Translated "Tuesday".
   * 
   * @return translated "Tuesday"
   */
  @DefaultMessage("Tuesday")
  @Key("date_dayNames_3")
  String date_dayNames_3();

  /**
   * Translated "Wednesday".
   * 
   * @return translated "Wednesday"
   */
  @DefaultMessage("Wednesday")
  @Key("date_dayNames_4")
  String date_dayNames_4();

  /**
   * Translated "Thursday".
   * 
   * @return translated "Thursday"
   */
  @DefaultMessage("Thursday")
  @Key("date_dayNames_5")
  String date_dayNames_5();

  /**
   * Translated "Friday".
   * 
   * @return translated "Friday"
   */
  @DefaultMessage("Friday")
  @Key("date_dayNames_6")
  String date_dayNames_6();

  /**
   * Translated "Saturday".
   * 
   * @return translated "Saturday"
   */
  @DefaultMessage("Saturday")
  @Key("date_dayNames_7")
  String date_dayNames_7();

  /**
   * Translated "Sun".
   * 
   * @return translated "Sun"
   */
  @DefaultMessage("Sun")
  @Key("date_shortDayNames_1")
  String date_shortDayNames_1();

  /**
   * Translated "Mon".
   * 
   * @return translated "Mon"
   */
  @DefaultMessage("Mon")
  @Key("date_shortDayNames_2")
  String date_shortDayNames_2();

  /**
   * Translated "Tue".
   * 
   * @return translated "Tue"
   */
  @DefaultMessage("Tue")
  @Key("date_shortDayNames_3")
  String date_shortDayNames_3();

  /**
   * Translated "Wed".
   * 
   * @return translated "Wed"
   */
  @DefaultMessage("Wed")
  @Key("date_shortDayNames_4")
  String date_shortDayNames_4();

  /**
   * Translated "Thu".
   * 
   * @return translated "Thu"
   */
  @DefaultMessage("Thu")
  @Key("date_shortDayNames_5")
  String date_shortDayNames_5();

  /**
   * Translated "Fri".
   * 
   * @return translated "Fri"
   */
  @DefaultMessage("Fri")
  @Key("date_shortDayNames_6")
  String date_shortDayNames_6();

  /**
   * Translated "Sat".
   * 
   * @return translated "Sat"
   */
  @DefaultMessage("Sat")
  @Key("date_shortDayNames_7")
  String date_shortDayNames_7();

  /**
   * Translated "January".
   * 
   * @return translated "January"
   */
  @DefaultMessage("January")
  @Key("date_monthNames_1")
  String date_monthNames_1();

  /**
   * Translated "February".
   * 
   * @return translated "February"
   */
  @DefaultMessage("February")
  @Key("date_monthNames_2")
  String date_monthNames_2();

  /**
   * Translated "March".
   * 
   * @return translated "March"
   */
  @DefaultMessage("March")
  @Key("date_monthNames_3")
  String date_monthNames_3();

  /**
   * Translated "April".
   * 
   * @return translated "April"
   */
  @DefaultMessage("April")
  @Key("date_monthNames_4")
  String date_monthNames_4();

  /**
   * Translated "May".
   * 
   * @return translated "May"
   */
  @DefaultMessage("May")
  @Key("date_monthNames_5")
  String date_monthNames_5();

  /**
   * Translated "June".
   * 
   * @return translated "June"
   */
  @DefaultMessage("June")
  @Key("date_monthNames_6")
  String date_monthNames_6();

  /**
   * Translated "July".
   * 
   * @return translated "July"
   */
  @DefaultMessage("July")
  @Key("date_monthNames_7")
  String date_monthNames_7();

  /**
   * Translated "August".
   * 
   * @return translated "August"
   */
  @DefaultMessage("August")
  @Key("date_monthNames_8")
  String date_monthNames_8();

  /**
   * Translated "September".
   * 
   * @return translated "September"
   */
  @DefaultMessage("September")
  @Key("date_monthNames_9")
  String date_monthNames_9();

  /**
   * Translated "October".
   * 
   * @return translated "October"
   */
  @DefaultMessage("October")
  @Key("date_monthNames_10")
  String date_monthNames_10();

  /**
   * Translated "November".
   * 
   * @return translated "November"
   */
  @DefaultMessage("November")
  @Key("date_monthNames_11")
  String date_monthNames_11();

  /**
   * Translated "December".
   * 
   * @return translated "December"
   */
  @DefaultMessage("December")
  @Key("date_monthNames_12")
  String date_monthNames_12();

  /**
   * Translated "Jan".
   * 
   * @return translated "Jan"
   */
  @DefaultMessage("Jan")
  @Key("date_shortMonthNames_1")
  String date_shortMonthNames_1();

  /**
   * Translated "Feb".
   * 
   * @return translated "Feb"
   */
  @DefaultMessage("Feb")
  @Key("date_shortMonthNames_2")
  String date_shortMonthNames_2();

  /**
   * Translated "Mar".
   * 
   * @return translated "Mar"
   */
  @DefaultMessage("Mar")
  @Key("date_shortMonthNames_3")
  String date_shortMonthNames_3();

  /**
   * Translated "Apr".
   * 
   * @return translated "Apr"
   */
  @DefaultMessage("Apr")
  @Key("date_shortMonthNames_4")
  String date_shortMonthNames_4();

  /**
   * Translated "May".
   * 
   * @return translated "May"
   */
  @DefaultMessage("May")
  @Key("date_shortMonthNames_5")
  String date_shortMonthNames_5();

  /**
   * Translated "Jun".
   * 
   * @return translated "Jun"
   */
  @DefaultMessage("Jun")
  @Key("date_shortMonthNames_6")
  String date_shortMonthNames_6();

  /**
   * Translated "Jul".
   * 
   * @return translated "Jul"
   */
  @DefaultMessage("Jul")
  @Key("date_shortMonthNames_7")
  String date_shortMonthNames_7();

  /**
   * Translated "Aug".
   * 
   * @return translated "Aug"
   */
  @DefaultMessage("Aug")
  @Key("date_shortMonthNames_8")
  String date_shortMonthNames_8();

  /**
   * Translated "Sep".
   * 
   * @return translated "Sep"
   */
  @DefaultMessage("Sep")
  @Key("date_shortMonthNames_9")
  String date_shortMonthNames_9();

  /**
   * Translated "Oct".
   * 
   * @return translated "Oct"
   */
  @DefaultMessage("Oct")
  @Key("date_shortMonthNames_10")
  String date_shortMonthNames_10();

  /**
   * Translated "Nov".
   * 
   * @return translated "Nov"
   */
  @DefaultMessage("Nov")
  @Key("date_shortMonthNames_11")
  String date_shortMonthNames_11();

  /**
   * Translated "Dec".
   * 
   * @return translated "Dec"
   */
  @DefaultMessage("Dec")
  @Key("date_shortMonthNames_12")
  String date_shortMonthNames_12();

  /**
   * Translated "Apply".
   * 
   * @return translated "Apply"
   */
  @DefaultMessage("Apply")
  @Key("dialog_ApplyButtonTitle")
  String dialog_ApplyButtonTitle();

  /**
   * Translated "Please enter a value".
   * 
   * @return translated "Please enter a value"
   */
  @DefaultMessage("Please enter a value")
  @Key("dialog_AskForValueTitle")
  String dialog_AskForValueTitle();

  /**
   * Translated "Question".
   * 
   * @return translated "Question"
   */
  @DefaultMessage("Question")
  @Key("dialog_AskTitle")
  String dialog_AskTitle();

  /**
   * Translated "Cancel".
   * 
   * @return translated "Cancel"
   */
  @DefaultMessage("Cancel")
  @Key("dialog_CancelButtonTitle")
  String dialog_CancelButtonTitle();

  /**
   * Translated "Confirm".
   * 
   * @return translated "Confirm"
   */
  @DefaultMessage("Confirm")
  @Key("dialog_ConfirmTitle")
  String dialog_ConfirmTitle();

  /**
   * Translated "Done".
   * 
   * @return translated "Done"
   */
  @DefaultMessage("Done")
  @Key("dialog_DoneButtonTitle")
  String dialog_DoneButtonTitle();

  /**
   * Translated "Log in".
   * 
   * @return translated "Log in"
   */
  @DefaultMessage("Log in")
  @Key("dialog_LoginButtonTitle")
  String dialog_LoginButtonTitle();

  /**
   * Translated "Invalid username or password".
   * 
   * @return translated "Invalid username or password"
   */
  @DefaultMessage("Invalid username or password")
  @Key("dialog_LoginErrorMessage")
  String dialog_LoginErrorMessage();

  /**
   * Translated "Please log in".
   * 
   * @return translated "Please log in"
   */
  @DefaultMessage("Please log in")
  @Key("dialog_LoginTitle")
  String dialog_LoginTitle();

  /**
   * Translated "No".
   * 
   * @return translated "No"
   */
  @DefaultMessage("No")
  @Key("dialog_NoButtonTitle")
  String dialog_NoButtonTitle();

  /**
   * Translated "OK".
   * 
   * @return translated "OK"
   */
  @DefaultMessage("OK")
  @Key("dialog_OkButtonTitle")
  String dialog_OkButtonTitle();

  /**
   * Translated "Password".
   * 
   * @return translated "Password"
   */
  @DefaultMessage("Password")
  @Key("dialog_PasswordTitle")
  String dialog_PasswordTitle();

  /**
   * Translated "Note".
   * 
   * @return translated "Note"
   */
  @DefaultMessage("Note")
  @Key("dialog_SayTitle")
  String dialog_SayTitle();

  /**
   * Translated "Username".
   * 
   * @return translated "Username"
   */
  @DefaultMessage("Username")
  @Key("dialog_UserNameTitle")
  String dialog_UserNameTitle();

  /**
   * Translated "Warning".
   * 
   * @return translated "Warning"
   */
  @DefaultMessage("Warning")
  @Key("dialog_WarnTitle")
  String dialog_WarnTitle();

  /**
   * Translated "Yes".
   * 
   * @return translated "Yes"
   */
  @DefaultMessage("Yes")
  @Key("dialog_YesButtonTitle")
  String dialog_YesButtonTitle();

  /**
   * Translated "The following errors were found".
   * 
   * @return translated "The following errors were found"
   */
  @DefaultMessage("The following errors were found")
  @Key("dynamicForm_errorsPreamble")
  String dynamicForm_errorsPreamble();

  /**
   * Translated "Form was unable to be submitted. The most likely cause for this is an invalid value in an upload field.".
   * 
   * @return translated "Form was unable to be submitted. The most likely cause for this is an invalid value in an upload field."
   */
  @DefaultMessage("Form was unable to be submitted. The most likely cause for this is an invalid value in an upload field.")
  @Key("dynamicForm_formSubmitFailedWarning")
  String dynamicForm_formSubmitFailedWarning();

  /**
   * Translated "Original value: $value".
   * 
   * @return translated "Original value: $value"
   */
  @DefaultMessage("Original value: $value")
  @Key("dynamicForm_originalValueMessage")
  String dynamicForm_originalValueMessage();

  /**
   * Translated "Add".
   * 
   * @return translated "Add"
   */
  @DefaultMessage("Add")
  @Key("filterBuilder_addButtonPrompt")
  String filterBuilder_addButtonPrompt();

  /**
   * Translated "Match All".
   * 
   * @return translated "Match All"
   */
  @DefaultMessage("Match All")
  @Key("filterBuilder_matchAllTitle")
  String filterBuilder_matchAllTitle();

  /**
   * Translated "Match Any".
   * 
   * @return translated "Match Any"
   */
  @DefaultMessage("Match Any")
  @Key("filterBuilder_matchAnyTitle")
  String filterBuilder_matchAnyTitle();

  /**
   * Translated "Match None".
   * 
   * @return translated "Match None"
   */
  @DefaultMessage("Match None")
  @Key("filterBuilder_matchNoneTitle")
  String filterBuilder_matchNoneTitle();

  /**
   * Translated "[missing field definition]".
   * 
   * @return translated "[missing field definition]"
   */
  @DefaultMessage("[missing field definition]")
  @Key("filterBuilder_missingFieldPrompt")
  String filterBuilder_missingFieldPrompt();

  /**
   * Translated "and".
   * 
   * @return translated "and"
   */
  @DefaultMessage("and")
  @Key("filterBuilder_radioOptions_and")
  String filterBuilder_radioOptions_and();

  /**
   * Translated "not".
   * 
   * @return translated "not"
   */
  @DefaultMessage("not")
  @Key("filterBuilder_radioOptions_not")
  String filterBuilder_radioOptions_not();

  /**
   * Translated "or".
   * 
   * @return translated "or"
   */
  @DefaultMessage("or")
  @Key("filterBuilder_radioOptions_or")
  String filterBuilder_radioOptions_or();

  /**
   * Translated "and".
   * 
   * @return translated "and"
   */
  @DefaultMessage("and")
  @Key("filterBuilder_rangeSeparator")
  String filterBuilder_rangeSeparator();

  /**
   * Translated "Remove".
   * 
   * @return translated "Remove"
   */
  @DefaultMessage("Remove")
  @Key("filterBuilder_removeButtonPrompt")
  String filterBuilder_removeButtonPrompt();

  /**
   * Translated "Add Subclause".
   * 
   * @return translated "Add Subclause"
   */
  @DefaultMessage("Add Subclause")
  @Key("filterBuilder_subClauseButtonPrompt")
  String filterBuilder_subClauseButtonPrompt();

  /**
   * Translated "+()".
   * 
   * @return translated "+()"
   */
  @DefaultMessage("+()")
  @Key("filterBuilder_subClauseButtonTitle")
  String filterBuilder_subClauseButtonTitle();

  /**
   * Translated "and".
   * 
   * @return translated "and"
   */
  @DefaultMessage("and")
  @Key("filterBuilder_topOperator")
  String filterBuilder_topOperator();

  /**
   * Translated "Operator".
   * 
   * @return translated "Operator"
   */
  @DefaultMessage("Operator")
  @Key("filterBuilder_operatorPickerTitle")
  String filterBuilder_operatorPickerTitle();
  
  /**
   * Translated "Field Name".
   * 
   * @return translated "Field Name"
   */
  @DefaultMessage("Field Name")
  @Key("filterBuilder_fieldPickerTitle")
  String filterBuilder_fieldPickerTitle();
  
  /**
   * Translated "Overall Operator".
   * 
   * @return translated "Overall Operator"
   */
  @DefaultMessage("Overall Operator")
  @Key("filterBuilder_radioOperatorTitle")
  String filterBuilder_radioOperatorTitle();
  
  /**
   * Translated "Clause Operator".
   * 
   * @return translated "Clause Operator"
   */
  @DefaultMessage("Clause Operator")
  @Key("filterBuilder_topOperatorTitle")
  String filterBuilder_topOperatorTitle();
  
  /**
   * Translated "and".
   * 
   * @return translated "and"
   */
  @DefaultMessage("and")
  @Key("FilterBuilder_inlineAndTitle")
  String FilterBuilder_inlineAndTitle();

  /**
   * Translated "or".
   * 
   * @return translated "or"
   */
  @DefaultMessage("or")
  @Key("FilterBuilder_inlineOrTitle")
  String FilterBuilder_inlineOrTitle();

  /**
   * Translated "and not".
   * 
   * @return translated "and not"
   */
  @DefaultMessage("and not")
  @Key("FilterBuilder_inlineAndNotTitle")
  String FilterBuilder_inlineAndNotTitle();
  
  /**
   * Translated "Advanced..".
   * 
   * @return translated "Advanced.."
   */
  @DefaultMessage("Advanced..")
  @Key("FilterBuilder_modeSwitcherAdvancedMessage")
  String FilterBuilder_modeSwitcherAdvancedMessage();
    
  /**
   * Translated "Simple Mode..".
   * 
   * @return translated "Simple Mode.."
   */
  @DefaultMessage("Simple Mode..")
  @Key("FilterBuilder_modeSwitcherSimpleMessage")
  String FilterBuilder_modeSwitcherSimpleMessage();
    
  /**
   * Translated "Criteria will be modified to fit in simpler editing interface".
   * 
   * @return translated "Criteria will be modified to fit in simpler editing interface"
   */
  @DefaultMessage("Criteria will be modified to fit in simpler editing interface")
  @Key("FilterBuilder_modeSwitcherFlattenWarningMessage")
  String FilterBuilder_modeSwitcherFlattenWarningMessage();
    
  /**
   * Translated "Remove".
   * 
   * @return translated "Remove"
   */
  @DefaultMessage("Remove")
  @Key("filterClause_removeButtonPrompt")
  String filterClause_removeButtonPrompt();

  /**
   * Translated "Field Name".
   * 
   * @return translated "Field Name"
   */
  @DefaultMessage("Field Name")
  @Key("filterClause_fieldPickerTitle")
  String filterClause_fieldPickerTitle();

  /**
   * Translated "Value".
   * 
   * @return translated "Value"
   */
  @DefaultMessage("Value")
  @Key("filterClause_valueItemTitle")
  String filterClause_valueItemTitle();
  
  /**
   * Translated "Operator".
   * 
   * @return translated "Operator"
   */
  @DefaultMessage("Operator")
  @Key("filterClause_operatorPickerTitle")
  String filterClause_operatorPickerTitle();

  /**
   * Translated "Is Frozen".
   * 
   * @return translated "Is Frozen"
   */
  @DefaultMessage("Is Frozen")
  @Key("fieldPickerField_frozenTitle")
  String fieldPickerField_frozenTitle();

  /**
   * Translated "Precision".
   * 
   * @return translated "Precision"
   */
  @DefaultMessage("Precision")
  @Key("fieldPickerField_precisionTitle")
  String fieldPickerField_precisionTitle();

  /**
   * Translated "Decimal Precision".
   * 
   * @return translated "Decimal Precision"
   */
  @DefaultMessage("Decimal Precision")
  @Key("fieldPickerField_decimalPrecisionTitle")
  String fieldPickerField_decimalPrecisionTitle();

  /**
   * Translated "Decimal Pad".
   * 
   * @return translated "Decimal Pad"
   */
  @DefaultMessage("Decimal Pad")
  @Key("fieldPickerField_decimalPadTitle")
  String fieldPickerField_decimalPadTitle();

  /**
   * Translated "Header Text Alignment".
   * 
   * @return translated "Header Text Alignment"
   */
  @DefaultMessage("Header Text Alignment")
  @Key("fieldPickerField_alignTitle")
  String fieldPickerField_alignTitle();

  /**
   * Translated "Data Alignment".
   * 
   * @return translated "Data Alignment"
   */
  @DefaultMessage("Data Alignment")
  @Key("fieldPickerField_cellAlignTitle")  
  String fieldPickerField_cellAlignTitle();

  /**
   * Translated "Highlights...".
   * 
   * @return translated "Highlights..."
   */
  @DefaultMessage("Highlights...")
  @Key("fieldPicker_hilitesText")
  String fieldPicker_hilitesText();

  /**
   * Translated "Available Fields".
   * 
   * @return translated "Available Fields"
   */
  @DefaultMessage("Available Fields")
  @Key("fieldPicker_availableFieldsTitle")
  String fieldPicker_availableFieldsTitle();

  /**
   * Translated "Visible Fields".
   * 
   * @return translated "Visible Fields"
   */
  @DefaultMessage("Visible Fields")
  @Key("fieldPicker_currentFieldsTitle")
  String fieldPicker_currentFieldsTitle();

  /**
   * Translated "Must save pending changes to proceed. OK?".
   * 
   * @return translated "Must save pending changes to proceed. OK?"
   */
  @DefaultMessage("Must save pending changes to proceed. OK?")
  @Key("fieldPicker_confirmText")
  String fieldPicker_confirmText();

  /**
   * Translated "You are about to remove the field. Are you sure?".
   * 
   * @return translated "You are about to remove the field. Are you sure?"
   */
  @DefaultMessage("You are about to remove the field. Are you sure?")
  @Key("fieldPicker_removeText")
  String fieldPicker_removeText();

  /**
   * Translated "Drag and drop or use arrows to move fields.  Drag reorder to change field order.".
   * 
   * @return translated "Drag and drop or use arrows to move fields.  Drag reorder to change field order."
   */
  @DefaultMessage("Drag and drop or use arrows to move fields.  Drag reorder to change field order.")
  @Key("fieldPicker_instructions")
  String fieldPicker_instructions();

  /**
   * Translated "Apply".
   * 
   * @return translated "Apply"
   */
  @DefaultMessage("Apply")
  @Key("fieldPicker_saveAndExitButtonTitle")
  String fieldPicker_saveAndExitButtonTitle();

  /**
   * Translated "Cancel".
   * 
   * @return translated "Cancel"
   */
  @DefaultMessage("Cancel")
  @Key("fieldPicker_cancelButtonTitle")
  String fieldPicker_cancelButtonTitle();

  /**
   * Translated "Add Custom Fields".
   * 
   * @return translated "Add Custom Fields"
   */
  @DefaultMessage("Add Custom Fields")
  @Key("fieldPicker_addCustomFieldsButtonTitle")
  String fieldPicker_addCustomFieldsButtonTitle();

  /**
   * Translated "Name".
   * 
   * @return translated "Name"
   */
  @DefaultMessage("Name")
  @Key("fieldPicker_availableTitleTitle")
  String fieldPicker_availableTitleTitle();

  /**
   * Translated "Field Title".
   * 
   * @return translated "Field Title"
   */
  @DefaultMessage("Field Title")
  @Key("fieldPicker_currentTitleTitle")
  String fieldPicker_currentTitleTitle();
  
  /**
   * Translated "Sample Value".
   * 
   * @return translated "Sample Value"
   */
  @DefaultMessage("Sample Value")
  @Key("fieldPicker_sampleValueTitle")
  String fieldPicker_sampleValueTitle();
  
  /**
   * Translated "Field Picker".
   * 
   * @return translated "Field Picker"
   */
  @DefaultMessage("Field Picker")
  @Key("fieldPickerWindow_title")
  String fieldPickerWindow_title();

  /**
   * Translated "Remove".
   * 
   * @return translated "Remove"
   */
  @DefaultMessage("Remove")
  @Key("fieldPicker_removeItemTitle")
  String fieldPicker_removeItemTitle();

    /**
   * Translated "[No title specified]".
   * 
   * @return translated "[No title specified]"
   */
  @DefaultMessage("[No title specified]")
  @Key("fieldPicker_emptyTitleHint")
  String fieldPicker_emptyTitleHint();

  /**
   * Translated "null".
   * 
   * @return translated "null"
   */
  @DefaultMessage("null")
  @Key("formItem_pickerIconPrompt")
  String formItem_pickerIconPrompt();

  /**
   * Translated "Auto hide fields used in formula".
   * 
   * @return translated "Auto hide fields used in formula"
   */
  @DefaultMessage("Auto hide fields used in formula")
  @Key("formulaBuilder_autoHideCheckBoxLabel")
  String formulaBuilder_autoHideCheckBoxLabel();

  /**
   * Translated "Formula".
   * 
   * @return translated "Formula"
   */
  @DefaultMessage("Formula")
  @Key("formulaBuilder_builderTypeText")
  String formulaBuilder_builderTypeText();

  /**
   * Translated "Cancel".
   * 
   * @return translated "Cancel"
   */
  @DefaultMessage("Cancel")
  @Key("formulaBuilder_cancelButtonTitle")
  String formulaBuilder_cancelButtonTitle();

  /**
   * Translated "New Field".
   * 
   * @return translated "New Field"
   */
  @DefaultMessage("New Field")
  @Key("formulaBuilder_defaultNewFieldTitle")
  String formulaBuilder_defaultNewFieldTitle();

  /**
   * Translated "For basic arithmetic, type in symbols (+-/%) directly.<p>The following functions are available:".
   * 
   * @return translated "For basic arithmetic, type in symbols (+-/%) directly.<p>The following functions are available:"
   */
  @DefaultMessage("For basic arithmetic, type in symbols (+-/%) directly.<p>The following functions are available:")
  @Key("formulaBuilder_helpTextIntro")
  String formulaBuilder_helpTextIntro();

  /**
   * Translated "$builderType Help".
   * 
   * @return translated "$builderType Help"
   */
  @DefaultMessage("$builderType Help")
  @Key("formulaBuilder_helpWindowTitle")
  String formulaBuilder_helpWindowTitle();

  /**
   * Translated "The following fields are available for use in this".
   * 
   * @return translated "The following fields are available for use in this"
   */
  @DefaultMessage("The following fields are available for use in this")
  @Key("formulaBuilder_instructionsTextStart")
  String formulaBuilder_instructionsTextStart();

  /**
   * Translated "Invalid blank $builderType".
   * 
   * @return translated "Invalid blank $builderType"
   */
  @DefaultMessage("Invalid blank $builderType")
  @Key("formulaBuilder_invalidBlankPrompt")
  String formulaBuilder_invalidBlankPrompt();

  /**
   * Translated "Invalid $builderType: $errorText".
   * 
   * @return translated "Invalid $builderType: $errorText"
   */
  @DefaultMessage("Invalid $builderType: $errorText")
  @Key("formulaBuilder_invalidBuilderPrompt")
  String formulaBuilder_invalidBuilderPrompt();

  /**
   * Translated "The generated function is invalid - Check your $builderType and retry.".
   * 
   * @return translated "The generated function is invalid - Check your $builderType and retry."
   */
  @DefaultMessage("The generated function is invalid - Check your $builderType and retry.")
  @Key("formulaBuilder_invalidGeneratedFunctionPrompt")
  String formulaBuilder_invalidGeneratedFunctionPrompt();

  /**
   * Translated "Key".
   * 
   * @return translated "Key"
   */
  @DefaultMessage("Key")
  @Key("formulaBuilder_keyColumnTitle")
  String formulaBuilder_keyColumnTitle();

  /**
   * Translated "Sample:".
   * 
   * @return translated "Sample:"
   */
  @DefaultMessage("Sample:")
  @Key("formulaBuilder_sampleHeaderTitle")
  String formulaBuilder_sampleHeaderTitle();

  /**
   * Translated "For record:".
   * 
   * @return translated "For record:"
   */
  @DefaultMessage("For record:")
  @Key("formulaBuilder_samplePromptForRecord")
  String formulaBuilder_samplePromptForRecord();

  /**
   * Translated "Output:".
   * 
   * @return translated "Output:"
   */
  @DefaultMessage("Output:")
  @Key("formulaBuilder_samplePromptOutput")
  String formulaBuilder_samplePromptOutput();

  /**
   * Translated "Save".
   * 
   * @return translated "Save"
   */
  @DefaultMessage("Save")
  @Key("formulaBuilder_saveButtonTitle")
  String formulaBuilder_saveButtonTitle();

  /**
   * Translated "Save changes to this $builderType?".
   * 
   * @return translated "Save changes to this $builderType?"
   */
  @DefaultMessage("Save changes to this $builderType?")
  @Key("formulaBuilder_saveConfirmationPrompt")
  String formulaBuilder_saveConfirmationPrompt();

  /**
   * Translated "Source Field".
   * 
   * @return translated "Source Field"
   */
  @DefaultMessage("Source Field")
  @Key("formulaBuilder_sourceFieldColumnTitle")
  String formulaBuilder_sourceFieldColumnTitle();

  /**
   * Translated "Test".
   * 
   * @return translated "Test"
   */
  @DefaultMessage("Test")
  @Key("formulaBuilder_testButtonTitle")
  String formulaBuilder_testButtonTitle();

  /**
   * Translated "Title".
   * 
   * @return translated "Title"
   */
  @DefaultMessage("Title")
  @Key("formulaBuilder_titleFieldTitle")
  String formulaBuilder_titleFieldTitle();

  /**
   * Translated "Valid $builderType".
   * 
   * @return translated "Valid $builderType"
   */
  @DefaultMessage("Valid $builderType")
  @Key("formulaBuilder_validBuilderPrompt")
  String formulaBuilder_validBuilderPrompt();

  /**
   * Translated "[No Explicit Error]".
   * 
   * @return translated "[No Explicit Error]"
   */
  @DefaultMessage("[No Explicit Error]")
  @Key("formulaBuilder_defaultErrorText")
  String formulaBuilder_defaultErrorText();
  
  /**
   * Translated "Save & Add Another".
   * 
   * @return translated "Save & Add Another"
   */
  @DefaultMessage("Save & Add Another")
  @Key("formulaBuilder_saveAddAnotherButtonTitle")
  String formulaBuilder_saveAddAnotherButtonTitle();
  
  /**
   * Translated "Another field already has the title ''$fieldTitle''.  Continue anyway?".
   * 
   * @return translated "Another field already has the title ''$fieldTitle''.  Continue anyway?"
   */
  @DefaultMessage("Another field already has the title ''$fieldTitle''.  Continue anyway?")
  @Key("formulaBuilder_warnDuplicateTitlesMessage")
  String formulaBuilder_warnDuplicateTitlesMessage();

  /**
   * Translated "by Day of Month".
   * 
   * @return translated "by Day of Month"
   */
  @DefaultMessage("by Day of Month")
  @Key("groupingMessages_byDayOfMonthTitle")
  String groupingMessages_byDayOfMonthTitle();

  /**
   * Translated "by Day".
   * 
   * @return translated "by Day"
   */
  @DefaultMessage("by Day")
  @Key("groupingMessages_byDayTitle")
  String groupingMessages_byDayTitle();

  /**
   * Translated "by Hours".
   * 
   * @return translated "by Hours"
   */
  @DefaultMessage("by Hours")
  @Key("groupingMessages_byHoursTitle")
  String groupingMessages_byHoursTitle();

  /**
   * Translated "by Milliseconds".
   * 
   * @return translated "by Milliseconds"
   */
  @DefaultMessage("by Milliseconds")
  @Key("groupingMessages_byMillisecondsTitle")
  String groupingMessages_byMillisecondsTitle();

  /**
   * Translated "by Minutes".
   * 
   * @return translated "by Minutes"
   */
  @DefaultMessage("by Minutes")
  @Key("groupingMessages_byMinutesTitle")
  String groupingMessages_byMinutesTitle();

  /**
   * Translated "by Month".
   * 
   * @return translated "by Month"
   */
  @DefaultMessage("by Month")
  @Key("groupingMessages_byMonthTitle")
  String groupingMessages_byMonthTitle();

  /**
   * Translated "by Quarter".
   * 
   * @return translated "by Quarter"
   */
  @DefaultMessage("by Quarter")
  @Key("groupingMessages_byQuarterTitle")
  String groupingMessages_byQuarterTitle();

  /**
   * Translated "by Seconds".
   * 
   * @return translated "by Seconds"
   */
  @DefaultMessage("by Seconds")
  @Key("groupingMessages_bySecondsTitle")
  String groupingMessages_bySecondsTitle();

  /**
   * Translated "by Upcoming".
   * 
   * @return translated "by Upcoming"
   */
  @DefaultMessage("by Upcoming")
  @Key("groupingMessages_byUpcomingTitle")
  String groupingMessages_byUpcomingTitle();

  /**
   * Translated "by Week".
   * 
   * @return translated "by Week"
   */
  @DefaultMessage("by Week")
  @Key("groupingMessages_byWeekTitle")
  String groupingMessages_byWeekTitle();

  /**
   * Translated "by Year".
   * 
   * @return translated "by Year"
   */
  @DefaultMessage("by Year")
  @Key("groupingMessages_byYearTitle")
  String groupingMessages_byYearTitle();

  /**
   * Translated "Before".
   * 
   * @return translated "Before"
   */
  @DefaultMessage("Before")
  @Key("groupingMessages_upcomingBeforeTitle")
  String groupingMessages_upcomingBeforeTitle();

  /**
   * Translated "Later".
   * 
   * @return translated "Later"
   */
  @DefaultMessage("Later")
  @Key("groupingMessages_upcomingLaterTitle")
  String groupingMessages_upcomingLaterTitle();

  /**
   * Translated "Next Month".
   * 
   * @return translated "Next Month"
   */
  @DefaultMessage("Next Month")
  @Key("groupingMessages_upcomingNextMonthTitle")
  String groupingMessages_upcomingNextMonthTitle();

  /**
   * Translated "Next Week".
   * 
   * @return translated "Next Week"
   */
  @DefaultMessage("Next Week")
  @Key("groupingMessages_upcomingNextWeekTitle")
  String groupingMessages_upcomingNextWeekTitle();

  /**
   * Translated "This Week".
   * 
   * @return translated "This Week"
   */
  @DefaultMessage("This Week")
  @Key("groupingMessages_upcomingThisWeekTitle")
  String groupingMessages_upcomingThisWeekTitle();

  /**
   * Translated "Today".
   * 
   * @return translated "Today"
   */
  @DefaultMessage("Today")
  @Key("groupingMessages_upcomingTodayTitle")
  String groupingMessages_upcomingTodayTitle();

  /**
   * Translated "Tomorrow".
   * 
   * @return translated "Tomorrow"
   */
  @DefaultMessage("Tomorrow")
  @Key("groupingMessages_upcomingTomorrowTitle")
  String groupingMessages_upcomingTomorrowTitle();

  /**
   * Translated "Week #".
   * 
   * @return translated "Week #"
   */
  @DefaultMessage("Week #")
  @Key("groupingMessages_weekNumberTitle")
  String groupingMessages_weekNumberTitle();

  /**
   * Translated "minutes".
   * 
   * @return translated "minutes"
   */
  @DefaultMessage("minutes")
  @Key("groupingMessages_timezoneMinutesSuffix")
  String groupingMessages_timezoneMinutesSuffix();

  /**
   * Translated "seconds".
   * 
   * @return translated "seconds"
   */
  @DefaultMessage("seconds")
  @Key("groupingMessages_timezoneSecondsSuffix")
  String groupingMessages_timezoneSecondsSuffix();

  /**
   * Translated "by Day of Month".
   * 
   * @return translated "by Day of Month"
   */
  @DefaultMessage("by Day of Month")
  @Key("grouping_byDayOfMonthTitle")
  String grouping_byDayOfMonthTitle();

  /**
   * Translated "by Day".
   * 
   * @return translated "by Day"
   */
  @DefaultMessage("by Day")
  @Key("grouping_byDayTitle")
  String grouping_byDayTitle();

  /**
   * Translated "by Hours".
   * 
   * @return translated "by Hours"
   */
  @DefaultMessage("by Hours")
  @Key("grouping_byHoursTitle")
  String grouping_byHoursTitle();

  /**
   * Translated "by Milliseconds".
   * 
   * @return translated "by Milliseconds"
   */
  @DefaultMessage("by Milliseconds")
  @Key("grouping_byMillisecondsTitle")
  String grouping_byMillisecondsTitle();

  /**
   * Translated "by Minutes".
   * 
   * @return translated "by Minutes"
   */
  @DefaultMessage("by Minutes")
  @Key("grouping_byMinutesTitle")
  String grouping_byMinutesTitle();

  /**
   * Translated "by Month".
   * 
   * @return translated "by Month"
   */
  @DefaultMessage("by Month")
  @Key("grouping_byMonthTitle")
  String grouping_byMonthTitle();

  /**
   * Translated "by Quarter".
   * 
   * @return translated "by Quarter"
   */
  @DefaultMessage("by Quarter")
  @Key("grouping_byQuarterTitle")
  String grouping_byQuarterTitle();

  /**
   * Translated "by Seconds".
   * 
   * @return translated "by Seconds"
   */
  @DefaultMessage("by Seconds")
  @Key("grouping_bySecondsTitle")
  String grouping_bySecondsTitle();

  /**
   * Translated "by Upcoming".
   * 
   * @return translated "by Upcoming"
   */
  @DefaultMessage("by Upcoming")
  @Key("grouping_byUpcomingTitle")
  String grouping_byUpcomingTitle();

  /**
   * Translated "by Week".
   * 
   * @return translated "by Week"
   */
  @DefaultMessage("by Week")
  @Key("grouping_byWeekTitle")
  String grouping_byWeekTitle();

  /**
   * Translated "by Year".
   * 
   * @return translated "by Year"
   */
  @DefaultMessage("by Year")
  @Key("grouping_byYearTitle")
  String grouping_byYearTitle();

  /**
   * Translated "Before".
   * 
   * @return translated "Before"
   */
  @DefaultMessage("Before")
  @Key("grouping_upcomingBeforeTitle")
  String grouping_upcomingBeforeTitle();

  /**
   * Translated "Later".
   * 
   * @return translated "Later"
   */
  @DefaultMessage("Later")
  @Key("grouping_upcomingLaterTitle")
  String grouping_upcomingLaterTitle();

  /**
   * Translated "Next Month".
   * 
   * @return translated "Next Month"
   */
  @DefaultMessage("Next Month")
  @Key("grouping_upcomingNextMonthTitle")
  String grouping_upcomingNextMonthTitle();

  /**
   * Translated "Next Week".
   * 
   * @return translated "Next Week"
   */
  @DefaultMessage("Next Week")
  @Key("grouping_upcomingNextWeekTitle")
  String grouping_upcomingNextWeekTitle();

  /**
   * Translated "This Week".
   * 
   * @return translated "This Week"
   */
  @DefaultMessage("This Week")
  @Key("grouping_upcomingThisWeekTitle")
  String grouping_upcomingThisWeekTitle();

  /**
   * Translated "Today".
   * 
   * @return translated "Today"
   */
  @DefaultMessage("Today")
  @Key("grouping_upcomingTodayTitle")
  String grouping_upcomingTodayTitle();

  /**
   * Translated "Tomorrow".
   * 
   * @return translated "Tomorrow"
   */
  @DefaultMessage("Tomorrow")
  @Key("grouping_upcomingTomorrowTitle")
  String grouping_upcomingTomorrowTitle();

  /**
   * Translated "Week #".
   * 
   * @return translated "Week #"
   */
  @DefaultMessage("Week #")
  @Key("grouping_weekNumberTitle")
  String grouping_weekNumberTitle();

  /**
   * Translated "minutes".
   * 
   * @return translated "minutes"
   */
  @DefaultMessage("minutes")
  @Key("grouping_timezoneMinutesSuffix")
  String grouping_timezoneMinutesSuffix();

  /**
   * Translated "seconds".
   * 
   * @return translated "seconds"
   */
  @DefaultMessage("seconds")
  @Key("grouping_timezoneSecondsSuffix")
  String grouping_timezoneSecondsSuffix();

  /**
   * Translated "Remove".
   * 
   * @return translated "Remove"
   */
  @DefaultMessage("Remove")
  @Key("hiliteRule_removeButtonPrompt")
  String hiliteRule_removeButtonPrompt();

  /**
   * Translated "Color".
   * 
   * @return translated "Color"
   */
  @DefaultMessage("Color")
  @Key("hiliteRule_colorFieldTitle")
  String hiliteRule_colorFieldTitle();
  
  /**
   * Translated "Icon".
   * 
   * @return translated "Icon"
   */
  @DefaultMessage("Icon")
  @Key("hiliteRule_iconFieldTitle")
  String hiliteRule_iconFieldTitle();

  /**
   * Translated "Text".
   * 
   * @return translated "Text"
   */
  @DefaultMessage("Text")
  @Key("hiliteRule_foregroundColorTitle")
  String hiliteRule_foregroundColorTitle();
  

  /**
   * Translated "Background".
   * 
   * @return translated "Background"
   */
  @DefaultMessage("Background")
  @Key("hiliteRule_backgroundColorTitle")
  String hiliteRule_backgroundColorTitle();
  
  /**
   * Translated "Add Advanced Rule".
   * 
   * @return translated "Add Advanced Rule"
   */
  @DefaultMessage("Add Advanced Rule")
  @Key("hiliteEditor_addAdvancedRuleButtonTitle")
  String hiliteEditor_addAdvancedRuleButtonTitle();

  /**
   * Translated "Save".
   * 
   * @return translated "Save"
   */
  @DefaultMessage("Save")
  @Key("hiliteEditor_saveButtonTitle")
  String hiliteEditor_saveButtonTitle();

  /**
   * Translated "Cancel".
   * 
   * @return translated "Cancel"
   */
  @DefaultMessage("Cancel")
  @Key("hiliteEditor_cancelButtonTitle")
  String hiliteEditor_cancelButtonTitle();

  /**
   * Translated "Available Fields".
   * 
   * @return translated "Available Fields"
   */
  @DefaultMessage("Available Fields")
  @Key("hiliteEditor_availableFieldsColumnTitle")
  String hiliteEditor_availableFieldsColumnTitle();

  /**
   * Translated "Advanced Highlight Editor".
   * 
   * @return translated "Advanced Highlight Editor"
   */
  @DefaultMessage("Advanced Highlight Editor")
  @Key("advancedHiliteEditor_title")
  String advancedHiliteEditor_title();

  /**
   * Translated "Save".
   * 
   * @return translated "Save"
   */
  @DefaultMessage("Save")
  @Key("advancedHiliteEditor_saveButtonTitle")
  String advancedHiliteEditor_saveButtonTitle();

  /**
   * Translated "Cancel".
   * 
   * @return translated "Cancel"
   */
  @DefaultMessage("Cancel")
  @Key("advancedHiliteEditor_cancelButtonTitle")
  String advancedHiliteEditor_cancelButtonTitle();

  /**
   * Translated "Enter at least one rule, a color or icon, and a target field, or press ''Cancel'' to abandon changes.".
   * 
   * @return translated "Enter at least one rule, a color or icon, and a target field, or press ''Cancel'' to abandon changes."
   */
  @DefaultMessage("Enter at least one rule, a color or icon, and a target field, or press ''Cancel'' to abandon changes.")
  @Key("advancedHiliteEditor_invalidHilitePrompt")
  String advancedHiliteEditor_invalidHilitePrompt();

  /**
   * Translated "Filter".
   * 
   * @return translated "Filter"
   */
  @DefaultMessage("Filter")
  @Key("advancedHiliteEditor_filterGroupTitle")
  String advancedHiliteEditor_filterGroupTitle();
  
  /**
   * Translated "Appearance".
   * 
   * @return translated "Appearance"
   */
  @DefaultMessage("Appearance")
  @Key("advancedHiliteEditor_appearanceGroupTitle")
  String advancedHiliteEditor_appearanceGroupTitle();
  
  /**
   * Translated "Target Field(s)".
   * 
   * @return translated "Target Field(s)"
   */
  @DefaultMessage("Target Field(s)")
  @Key("advancedHiliteEditor_targetFieldsItemTitle")
  String advancedHiliteEditor_targetFieldsItemTitle();
  
  /**
   * Translated "Click icon to add...".
   * 
   * @return translated "Click icon to add..."
   */
  @DefaultMessage("Click icon to add...")
  @Key("multiFilePicker_emptyMessage")
  String multiFilePicker_emptyMessage();

  /**
   * Translated "Show Menu".
   * 
   * @return translated "Show Menu"
   */
  @DefaultMessage("Show Menu")
  @Key("iMenuButton_title")
  String iMenuButton_title();

  /**
   * Translated "Start at".
   * 
   * @return translated "Start at"
   */
  @DefaultMessage("Start at")
  @Key("listPropertiesPane_startNumberFieldTitle")
  String listPropertiesPane_startNumberFieldTitle();

  /**
   * Translated "List Properties".
   * 
   * @return translated "List Properties"
   */
  @DefaultMessage("List Properties")
  @Key("listPropertiesDialog_title")
  String listPropertiesDialog_title();

  /**
   * Translated "Apply".
   * 
   * @return translated "Apply"
   */
  @DefaultMessage("Apply")
  @Key("listPropertiesDialog_applyButtonTitle")
  String listPropertiesDialog_applyButtonTitle();

  /**
   * Translated "Cancel".
   * 
   * @return translated "Cancel"
   */
  @DefaultMessage("Cancel")
  @Key("listPropertiesDialog_cancelButtonTitle")
  String listPropertiesDialog_cancelButtonTitle();

  /**
   * Translated "Close portlet?".
   * 
   * @return translated "Close portlet?"
   */
  @DefaultMessage("Close portlet?")
  @Key("portlet_closeConfirmationMessage")
  String portlet_closeConfirmationMessage();

  /**
   * Translated "Auto Fit All Columns".
   * 
   * @return translated "Auto Fit All Columns"
   */
  @DefaultMessage("Auto Fit All Columns")
  @Key("listGrid_autoFitAllText")
  String listGrid_autoFitAllText();

  /**
   * Translated "Auto Fit".
   * 
   * @return translated "Auto Fit"
   */
  @DefaultMessage("Auto Fit")
  @Key("listGrid_autoFitFieldText")
  String listGrid_autoFitFieldText();

  /**
   * Translated "Cancelling this edit will clear unsaved edit values for this record. Continue?".
   * 
   * @return translated "Cancelling this edit will clear unsaved edit values for this record. Continue?"
   */
  @DefaultMessage("Cancelling this edit will clear unsaved edit values for this record. Continue?")
  @Key("listGrid_cancelEditingConfirmationMessage")
  String listGrid_cancelEditingConfirmationMessage();

  /**
   * Translated "Clear All Sorting".
   * 
   * @return translated "Clear All Sorting"
   */
  @DefaultMessage("Clear All Sorting")
  @Key("listGrid_clearAllSortingText")
  String listGrid_clearAllSortingText();

  /**
   * Translated "Clear Filter".
   * 
   * @return translated "Clear Filter"
   */
  @DefaultMessage("Clear Filter")
  @Key("listGrid_clearFilterText")
  String listGrid_clearFilterText();

  /**
   * Translated "Clear Sort".
   * 
   * @return translated "Clear Sort"
   */
  @DefaultMessage("Clear Sort")
  @Key("listGrid_clearSortFieldText")
  String listGrid_clearSortFieldText();

  /**
   * Translated "Configure Sort...".
   * 
   * @return translated "Configure Sort..."
   */
  @DefaultMessage("Configure Sort...")
  @Key("listGrid_configureSortText")
  String listGrid_configureSortText();

  /**
   * Translated "Configure Grouping...".
   * 
   * @return translated "Configure Grouping..."
   */
  @DefaultMessage("Configure Grouping...")
  @Key("listGrid_configureGroupingText")
  String listGrid_configureGroupingText();

  /**
   * Translated "This action will discard all unsaved edited values for this list.".
   * 
   * @return translated "This action will discard all unsaved edited values for this list."
   */
  @DefaultMessage("This action will discard all unsaved edited values for this list.")
  @Key("listGrid_confirmDiscardEditsMessage")
  String listGrid_confirmDiscardEditsMessage();

  /**
   * Translated "Delete".
   * 
   * @return translated "Delete"
   */
  @DefaultMessage("Delete")
  @Key("listGrid_deleteRecordContextMenuItemTitle")
  String listGrid_deleteRecordContextMenuItemTitle();

  /**
   * Translated "Save".
   * 
   * @return translated "Save"
   */
  @DefaultMessage("Save")
  @Key("listGrid_discardEditsSaveButtonTitle")
  String listGrid_discardEditsSaveButtonTitle();

  /**
   * Translated "Dismiss".
   * 
   * @return translated "Dismiss"
   */
  @DefaultMessage("Dismiss")
  @Key("listGrid_dismissEmbeddedComponentContextMenuItemTitle")
  String listGrid_dismissEmbeddedComponentContextMenuItemTitle();

  /**
   * Translated "No items to show.".
   * 
   * @return translated "No items to show."
   */
  @DefaultMessage("No items to show.")
  @Key("listGrid_emptyMessage")
  String listGrid_emptyMessage();

  /**
   * Translated "Columns".
   * 
   * @return translated "Columns"
   */
  @DefaultMessage("Columns")
  @Key("listGrid_fieldVisibilitySubmenuTitle")
  String listGrid_fieldVisibilitySubmenuTitle();

  /**
   * Translated "Freeze".
   * 
   * @return translated "Freeze"
   */
  @DefaultMessage("Freeze")
  @Key("listGrid_freezeFieldText")
  String listGrid_freezeFieldText();

  /**
   * Translated "Freeze on left".
   * 
   * @return translated "Freeze on left"
   */
  @DefaultMessage("Freeze on left")
  @Key("listGrid_freezeOnLeftText")
  String listGrid_freezeOnLeftText();

  /**
   * Translated "Freeze on right".
   * 
   * @return translated "Freeze on right"
   */
  @DefaultMessage("Freeze on right")
  @Key("listGrid_freezeOnRightText")
  String listGrid_freezeOnRightText();

  /**
   * Translated "Group by".
   * 
   * @return translated "Group by"
   */
  @DefaultMessage("Group by")
  @Key("listGrid_groupByText")
  String listGrid_groupByText();

  /**
   * Translated "Loading data...".
   * 
   * @return translated "Loading data..."
   */
  @DefaultMessage("Loading data...")
  @Key("listGrid_loadingDataMessage")
  String listGrid_loadingDataMessage();

  /**
   * Translated "This grid is limited to $count simultaneously expanded records.  Please collapse some expanded records and retry.".
   * 
   * @return translated "This grid is limited to $count simultaneously expanded records.  Please collapse some expanded records and retry."
   */
  @DefaultMessage("This grid is limited to $count simultaneously expanded records.  Please collapse some expanded records and retry.")
  @Key("listGrid_maxExpandedRecordsPrompt")
  String listGrid_maxExpandedRecordsPrompt();

  /**
   * Translated "-- Add New Row --".
   * 
   * @return translated "-- Add New Row --"
   */
  @DefaultMessage("-- Add New Row --")
  @Key("listGrid_newRecordRowMessage")
  String listGrid_newRecordRowMessage();

  /**
   * Translated "Edit".
   * 
   * @return translated "Edit"
   */
  @DefaultMessage("Edit")
  @Key("listGrid_openRecordEditorContextMenuItemTitle")
  String listGrid_openRecordEditorContextMenuItemTitle();

  /**
   * Translated "Cancel".
   * 
   * @return translated "Cancel"
   */
  @DefaultMessage("Cancel")
  @Key("listGrid_recordEditorCancelButtonTitle")
  String listGrid_recordEditorCancelButtonTitle();

  /**
   * Translated "Save".
   * 
   * @return translated "Save"
   */
  @DefaultMessage("Save")
  @Key("listGrid_recordEditorSaveButtonTitle")
  String listGrid_recordEditorSaveButtonTitle();

  /**
   * Translated "[Remove record]".
   * 
   * @return translated "[Remove record]"
   */
  @DefaultMessage("[Remove record]")
  @Key("listGrid_removeFieldTitle")
  String listGrid_removeFieldTitle();

  /**
   * Translated "Sort Ascending".
   * 
   * @return translated "Sort Ascending"
   */
  @DefaultMessage("Sort Ascending")
  @Key("listGrid_sortFieldAscendingText")
  String listGrid_sortFieldAscendingText();

  /**
   * Translated "Sort Descending".
   * 
   * @return translated "Sort Descending"
   */
  @DefaultMessage("Sort Descending")
  @Key("listGrid_sortFieldDescendingText")
  String listGrid_sortFieldDescendingText();

  /**
   * Translated "Unfreeze".
   * 
   * @return translated "Unfreeze"
   */
  @DefaultMessage("Unfreeze")
  @Key("listGrid_unfreezeFieldText")
  String listGrid_unfreezeFieldText();

  /**
   * Translated "Ungroup".
   * 
   * @return translated "Ungroup"
   */
  @DefaultMessage("Ungroup")
  @Key("listGrid_ungroupText")
  String listGrid_ungroupText();

  /**
   * Translated "Grouping data...".
   * 
   * @return translated "Grouping data..."
   */
  @DefaultMessage("Grouping data...")
  @Key("listGrid_asynchGroupingPrompt")
  String listGrid_asynchGroupingPrompt();

  /**
   * Translated "Replace value with".
   * 
   * @return translated "Replace value with"
   */
  @DefaultMessage("Replace value with")
  @Key("listGrid_hiliteReplaceValueFieldTitle")
  String listGrid_hiliteReplaceValueFieldTitle();

  /**
   * Translated "Filter".
   * 
   * @return translated "Filter"
   */
  @DefaultMessage("Filter")
  @Key("listGrid_filterButtonPrompt")
  String listGrid_filterButtonPrompt();

  /**
   * Translated "&nbsp;".
   * 
   * @return translated "&nbsp;"
   */
  @DefaultMessage("&nbsp;")
  @Key("listGrid_loadingMessage")
  String listGrid_loadingMessage();

  /**
   * Translated "Are you sure you want to delete this record?".
   * 
   * @return translated "Are you sure you want to delete this record?"
   */
  @DefaultMessage("Are you sure you want to delete this record?")
  @Key("listGrid_warnOnRemovalMessage")
  String listGrid_warnOnRemovalMessage();

  /**
   * Translated "corner button".
   * 
   * @return translated "corner button"
   */
  @DefaultMessage("corner button")
  @Key("listGrid_sorterButtonTitle")
  String listGrid_sorterButtonTitle();

  /**
   * Translated "You have unsaved changes - do you want to save them now?".
   * 
   * @return translated "You have unsaved changes - do you want to save them now?"
   */
  @DefaultMessage("You have unsaved changes - do you want to save them now?")
  @Key("listGrid_expansionEditorSaveDialogPrompt")
  String listGrid_expansionEditorSaveDialogPrompt();

  /**
   * Translated "Save".
   * 
   * @return translated "Save"
   */
  @DefaultMessage("Save")
  @Key("listGrid_expansionEditorSaveButtonTitle")
  String listGrid_expansionEditorSaveButtonTitle();

  /**
   * Translated " - ".
   * 
   * @return translated " - "
   */
  @DefaultMessage(" - ")
  @Key("listGrid_formulaBuilderSpanTitleSeparator")
  String listGrid_formulaBuilderSpanTitleSeparator();

  /**
   * Translated " - ".
   * 
   * @return translated " - "
   */
  @DefaultMessage(" - ")
  @Key("listGrid_sortEditorSpanTitleSeparator")
  String listGrid_sortEditorSpanTitleSeparator();

  /**
   * Translated " - ".
   * 
   * @return translated " - "
   */
  @DefaultMessage(" - ")
  @Key("listGrid_hiliteEditorSpanTitleSeparator")
  String listGrid_hiliteEditorSpanTitleSeparator();

  /**
   * Translated "Custom...".
   * 
   * @return translated "Custom..."
   */
  @DefaultMessage("Custom...")
  @Key("presetCriteriaItem_customOptionTitle")
  String presetCriteriaItem_customOptionTitle();

  /**
   * Translated "Show Menu".
   * 
   * @return translated "Show Menu"
   */
  @DefaultMessage("Show Menu")
  @Key("menuButton_title")
  String menuButton_title();

  /**
   * Translated "Choose a value".
   * 
   * @return translated "Choose a value"
   */
  @DefaultMessage("Choose a value")
  @Key("treeMenuButton_unselectedTitle")
  String treeMenuButton_unselectedTitle();

  /**
   * Translated "Since".
   * 
   * @return translated "Since"
   */
  @DefaultMessage("Since")
  @Key("miniDateRangeItem_fromDateOnlyPrefix")
  String miniDateRangeItem_fromDateOnlyPrefix();

  /**
   * Translated "Show Date Chooser".
   * 
   * @return translated "Show Date Chooser"
   */
  @DefaultMessage("Show Date Chooser")
  @Key("miniDateRangeItem_pickerIconPrompt")
  String miniDateRangeItem_pickerIconPrompt();

  /**
   * Translated "Before".
   * 
   * @return translated "Before"
   */
  @DefaultMessage("Before")
  @Key("miniDateRangeItem_toDateOnlyPrefix")
  String miniDateRangeItem_toDateOnlyPrefix();

  /**
   * Translated "Enter values".
   * 
   * @return translated "Enter values"
   */
  @DefaultMessage("Enter values")
  @Key("multiComboBoxItem_defaultHint")
  String multiComboBoxItem_defaultHint();

  /**
   * Translated "Click icon to add...".
   * 
   * @return translated "Click icon to add..."
   */
  @DefaultMessage("Click icon to add...")
  @Key("multiFileItem_emptyMessage")
  String multiFileItem_emptyMessage();

  /**
   * Translated "Add files".
   * 
   * @return translated "Add files"
   */
  @DefaultMessage("Add files")
  @Key("multiFileItem_editButtonPrompt")
  String multiFileItem_editButtonPrompt();

  /**
   * Translated "Remove selected files".
   * 
   * @return translated "Remove selected files"
   */
  @DefaultMessage("Remove selected files")
  @Key("multiFileItem_removeButtonPrompt")
  String multiFileItem_removeButtonPrompt();

  /**
   * Translated "OK".
   * 
   * @return translated "OK"
   */
  @DefaultMessage("OK")
  @Key("multiFileItem_pickerUploadButtonInitialTitle")
  String multiFileItem_pickerUploadButtonInitialTitle();

  /**
   * Translated "Save".
   * 
   * @return translated "Save"
   */
  @DefaultMessage("Save")
  @Key("multiFileItem_pickerUploadButtonTitle")
  String multiFileItem_pickerUploadButtonTitle();

  /**
   * Translated "Cancel".
   * 
   * @return translated "Cancel"
   */
  @DefaultMessage("Cancel")
  @Key("multiFileItem_pickerCancelButtonTitle")
  String multiFileItem_pickerCancelButtonTitle();

  /**
   * Translated "<u>Add&nbsp;another</u>".
   * 
   * @return translated "<u>Add&nbsp;another</u>"
   */
  @DefaultMessage("<u>Add&nbsp;another</u>")
  @Key("multiFileItem_pickerAddAnotherFileButtonTitle")
  String multiFileItem_pickerAddAnotherFileButtonTitle();

  /**
   * Translated "Saving $fileName $formattedFileSize".
   * 
   * @return translated "Saving fileName $formattedFileSize"
   */
  @DefaultMessage("Saving $fileName $formattedFileSize")
  @Key("multiFileItem_pickerUploadProgressLabel")
  String multiFileItem_pickerUploadProgressLabel();

  /**
   * Translated "Add Level".
   * 
   * @return translated "Add Level"
   */
  @DefaultMessage("Add Level")
  @Key("multiSortDialog_addLevelButtonTitle")
  String multiSortDialog_addLevelButtonTitle();

  /**
   * Translated "Apply".
   * 
   * @return translated "Apply"
   */
  @DefaultMessage("Apply")
  @Key("multiSortDialog_applyButtonTitle")
  String multiSortDialog_applyButtonTitle();

  /**
   * Translated "Ascending".
   * 
   * @return translated "Ascending"
   */
  @DefaultMessage("Ascending")
  @Key("multiSortDialog_ascendingTitle")
  String multiSortDialog_ascendingTitle();

  /**
   * Translated "Cancel".
   * 
   * @return translated "Cancel"
   */
  @DefaultMessage("Cancel")
  @Key("multiSortDialog_cancelButtonTitle")
  String multiSortDialog_cancelButtonTitle();

  /**
   * Translated "Copy Level".
   * 
   * @return translated "Copy Level"
   */
  @DefaultMessage("Copy Level")
  @Key("multiSortDialog_copyLevelButtonTitle")
  String multiSortDialog_copyLevelButtonTitle();

  /**
   * Translated "Delete Level".
   * 
   * @return translated "Delete Level"
   */
  @DefaultMessage("Delete Level")
  @Key("multiSortDialog_deleteLevelButtonTitle")
  String multiSortDialog_deleteLevelButtonTitle();

  /**
   * Translated "Descending".
   * 
   * @return translated "Descending"
   */
  @DefaultMessage("Descending")
  @Key("multiSortDialog_descendingTitle")
  String multiSortDialog_descendingTitle();

  /**
   * Translated "Order".
   * 
   * @return translated "Order"
   */
  @DefaultMessage("Order")
  @Key("multiSortDialog_directionFieldTitle")
  String multiSortDialog_directionFieldTitle();

  /**
   * Translated "Sort by".
   * 
   * @return translated "Sort by"
   */
  @DefaultMessage("Sort by")
  @Key("multiSortDialog_firstSortLevelTitle")
  String multiSortDialog_firstSortLevelTitle();

  /**
   * Translated "Columns may only be used once: ''$title'' is used multiple times.".
   * 
   * @return translated "Columns may only be used once: ''$title'' is used multiple times."
   */
  @DefaultMessage("Columns may only be used once: ''$title'' is used multiple times.")
  @Key("multiSortDialog_invalidListPrompt")
  String multiSortDialog_invalidListPrompt();

  /**
   * Translated "Move Level Down".
   * 
   * @return translated "Move Level Down"
   */
  @DefaultMessage("Move Level Down")
  @Key("multiSortDialog_levelDownPrompt")
  String multiSortDialog_levelDownPrompt();

  /**
   * Translated "Move Level Up".
   * 
   * @return translated "Move Level Up"
   */
  @DefaultMessage("Move Level Up")
  @Key("multiSortDialog_levelUpPrompt")
  String multiSortDialog_levelUpPrompt();

  /**
   * Translated "Then by".
   * 
   * @return translated "Then by"
   */
  @DefaultMessage("Then by")
  @Key("multiSortDialog_otherSortLevelTitle")
  String multiSortDialog_otherSortLevelTitle();

  /**
   * Translated "Column".
   * 
   * @return translated "Column"
   */
  @DefaultMessage("Column")
  @Key("multiSortDialog_propertyFieldTitle")
  String multiSortDialog_propertyFieldTitle();

  /**
   * Translated "Sort".
   * 
   * @return translated "Sort"
   */
  @DefaultMessage("Sort")
  @Key("multiSortDialog_title")
  String multiSortDialog_title();

  /**
   * Translated "Add Level".
   * 
   * @return translated "Add Level"
   */
  @DefaultMessage("Add Level")
  @Key("multiGroupDialog_addLevelButtonTitle")
  String multiGroupDialog_addLevelButtonTitle();

  /**
   * Translated "Apply".
   * 
   * @return translated "Apply"
   */
  @DefaultMessage("Apply")
  @Key("multiGroupDialog_applyButtonTitle")
  String multiGroupDialog_applyButtonTitle();

  /**
   * Translated "Cancel".
   * 
   * @return translated "Cancel"
   */
  @DefaultMessage("Cancel")
  @Key("multiGroupDialog_cancelButtonTitle")
  String multiGroupDialog_cancelButtonTitle();

  /**
   * Translated "Copy Level".
   * 
   * @return translated "Copy Level"
   */
  @DefaultMessage("Copy Level")
  @Key("multiGroupDialog_copyLevelButtonTitle")
  String multiGroupDialog_copyLevelButtonTitle();

  /**
   * Translated "Delete Level".
   * 
   * @return translated "Delete Level"
   */
  @DefaultMessage("Delete Level")
  @Key("multiGroupDialog_deleteLevelButtonTitle")
  String multiGroupDialog_deleteLevelButtonTitle();

  /**
   * Translated "Grouping".
   * 
   * @return translated "Grouping"
   */
  @DefaultMessage("Grouping")
  @Key("multiGroupDialog_groupingFieldTitle")
  String multiGroupDialog_groupingFieldTitle();

  /**
   * Translated "Columns may only be used once: ''$title'' is used multiple times.".
   * 
   * @return translated "Columns may only be used once: ''$title'' is used multiple times."
   */
  @DefaultMessage("Columns may only be used once: ''$title'' is used multiple times.")
  @Key("multiGroupDialog_invalidListPrompt")
  String multiGroupDialog_invalidListPrompt();

  /**
   * Translated "Move Level Down".
   * 
   * @return translated "Move Level Down"
   */
  @DefaultMessage("Move Level Down")
  @Key("multiGroupDialog_levelDownPrompt")
  String multiGroupDialog_levelDownPrompt();

  /**
   * Translated "Move Level Up".
   * 
   * @return translated "Move Level Up"
   */
  @DefaultMessage("Move Level Up")
  @Key("multiGroupDialog_levelUpPrompt")
  String multiGroupDialog_levelUpPrompt();

  /**
   * Translated "Column".
   * 
   * @return translated "Column"
   */
  @DefaultMessage("Column")
  @Key("multiGroupDialog_propertyFieldTitle")
  String multiGroupDialog_propertyFieldTitle();

  /**
   * Translated "Group".
   * 
   * @return translated "Group"
   */
  @DefaultMessage("Group")
  @Key("multiGroupDialog_title")
  String multiGroupDialog_title();

  /**
   * Translated "Group by".
   * 
   * @return translated "Group by"
   */
  @DefaultMessage("Group by")
  @Key("multiGroupDialog_firstGroupLevelTitle")
  String multiGroupDialog_firstGroupLevelTitle();

  /**
   * Translated "Then by".
   * 
   * @return translated "Then by"
   */
  @DefaultMessage("Then by")
  @Key("multiGroupDialog_otherGroupLevelTitle")
  String multiGroupDialog_otherGroupLevelTitle();
  
  /**
   * Translated "Match All".
   * 
   * @return translated "Match All"
   */
  @DefaultMessage("Match All")
  @Key("operators_andTitle")
  String operators_andTitle();

  /**
   * Translated "between (inclusive, match case)".
   * 
   * @return translated "between (inclusive, match case)"
   */
  @DefaultMessage("between (inclusive, match case)")
  @Key("operators_betweenInclusiveTitle")
  String operators_betweenInclusiveTitle();

  /**
   * Translated "between (match case)".
   * 
   * @return translated "between (match case)"
   */
  @DefaultMessage("between (match case)")
  @Key("operators_betweenTitle")
  String operators_betweenTitle();

  /**
   * Translated "between (inclusive)".
   * 
   * @return translated "between (inclusive)"
   */
  @DefaultMessage("between (inclusive)")
  @Key("operators_iBetweenInclusiveTitle")
  String operators_iBetweenInclusiveTitle();

  /**
   * Translated "between".
   * 
   * @return translated "between"
   */
  @DefaultMessage("between")
  @Key("operators_iBetweenTitle")
  String operators_iBetweenTitle();

  /**
   * Translated "contains (match case) another field value".
   * 
   * @return translated "contains (match case) another field value"
   */
  @DefaultMessage("contains (match case) another field value")
  @Key("operators_containsFieldTitle")
  String operators_containsFieldTitle();

  /**
   * Translated "contains (match case)".
   * 
   * @return translated "contains (match case)"
   */
  @DefaultMessage("contains (match case)")
  @Key("operators_containsTitle")
  String operators_containsTitle();

  /**
   * Translated "ends with (match case) another field value".
   * 
   * @return translated "ends with (match case) another field value"
   */
  @DefaultMessage("ends with (match case) another field value")
  @Key("operators_endsWithFieldTitle")
  String operators_endsWithFieldTitle();

  /**
   * Translated "ends with (match case)".
   * 
   * @return translated "ends with (match case)"
   */
  @DefaultMessage("ends with (match case)")
  @Key("operators_endsWithTitle")
  String operators_endsWithTitle();

  /**
   * Translated "matches other field".
   * 
   * @return translated "matches other field"
   */
  @DefaultMessage("matches other field")
  @Key("operators_equalsFieldTitle")
  String operators_equalsFieldTitle();

  /**
   * Translated "equals".
   * 
   * @return translated "equals"
   */
  @DefaultMessage("equals")
  @Key("operators_equalsTitle")
  String operators_equalsTitle();

  /**
   * Translated "greater than or equal to field".
   * 
   * @return translated "greater than or equal to field"
   */
  @DefaultMessage("greater than or equal to field")
  @Key("operators_greaterOrEqualFieldTitle")
  String operators_greaterOrEqualFieldTitle();

  /**
   * Translated "greater than or equal to".
   * 
   * @return translated "greater than or equal to"
   */
  @DefaultMessage("greater than or equal to")
  @Key("operators_greaterOrEqualTitle")
  String operators_greaterOrEqualTitle();

  /**
   * Translated "greater than field".
   * 
   * @return translated "greater than field"
   */
  @DefaultMessage("greater than field")
  @Key("operators_greaterThanFieldTitle")
  String operators_greaterThanFieldTitle();

  /**
   * Translated "greater than".
   * 
   * @return translated "greater than"
   */
  @DefaultMessage("greater than")
  @Key("operators_greaterThanTitle")
  String operators_greaterThanTitle();

  /**
   * Translated "contains".
   * 
   * @return translated "contains"
   */
  @DefaultMessage("contains")
  @Key("operators_iContainsTitle")
  String operators_iContainsTitle();

  /**
   * Translated "ends with".
   * 
   * @return translated "ends with"
   */
  @DefaultMessage("ends with")
  @Key("operators_iEndsWithTitle")
  String operators_iEndsWithTitle();

  /**
   * Translated "equals (disregard case)".
   * 
   * @return translated "equals (disregard case)"
   */
  @DefaultMessage("equals (disregard case)")
  @Key("operators_iEqualsTitle")
  String operators_iEqualsTitle();

  /**
   * Translated "matches pattern".
   *
   * @return translated "matches pattern"
   */
  @DefaultMessage("matches pattern")
  @Key("operators_iMatchesPatternTitle")
  String operators_iMatchesPatternTitle();

  /**
   * Translated "does not contain".
   * 
   * @return translated "does not contain"
   */
  @DefaultMessage("does not contain")
  @Key("operators_iNotContainsTitle")
  String operators_iNotContainsTitle();

  /**
   * Translated "does not end with".
   * 
   * @return translated "does not end with"
   */
  @DefaultMessage("does not end with")
  @Key("operators_iNotEndsWithTitle")
  String operators_iNotEndsWithTitle();

  /**
   * Translated "not equal (disregard case)".
   * 
   * @return translated "not equal (disregard case)"
   */
  @DefaultMessage("not equal (disregard case)")
  @Key("operators_iNotEqualTitle")
  String operators_iNotEqualTitle();

  /**
   * Translated "does not start with".
   * 
   * @return translated "does not start with"
   */
  @DefaultMessage("does not start with")
  @Key("operators_iNotStartsWithTitle")
  String operators_iNotStartsWithTitle();

  /**
   * Translated "starts with".
   * 
   * @return translated "starts with"
   */
  @DefaultMessage("starts with")
  @Key("operators_iStartsWithTitle")
  String operators_iStartsWithTitle();

  /**
   * Translated "is one of".
   * 
   * @return translated "is one of"
   */
  @DefaultMessage("is one of")
  @Key("operators_inSetTitle")
  String operators_inSetTitle();

  /**
   * Translated "matches expression".
   *
   * @return translated "matches expression"
   */
  @DefaultMessage("matches expression")
  @Key("operators_iregexpTitle")
  String operators_iregexpTitle();

  /**
   * Translated "is null".
   * 
   * @return translated "is null"
   */
  @DefaultMessage("is null")
  @Key("operators_isNullTitle")
  String operators_isNullTitle();

  /**
   * Translated "less than or equal to field".
   * 
   * @return translated "less than or equal to field"
   */
  @DefaultMessage("less than or equal to field")
  @Key("operators_lessOrEqualFieldTitle")
  String operators_lessOrEqualFieldTitle();

  /**
   * Translated "less than or equal to".
   * 
   * @return translated "less than or equal to"
   */
  @DefaultMessage("less than or equal to")
  @Key("operators_lessOrEqualTitle")
  String operators_lessOrEqualTitle();

  /**
   * Translated "less than field".
   * 
   * @return translated "less than field"
   */
  @DefaultMessage("less than field")
  @Key("operators_lessThanFieldTitle")
  String operators_lessThanFieldTitle();

  /**
   * Translated "less than".
   * 
   * @return translated "less than"
   */
  @DefaultMessage("less than")
  @Key("operators_lessThanTitle")
  String operators_lessThanTitle();

  /**
   * Translated "matches pattern (exact case)".
   *
   * @return translated "matches pattern (exact case)"
   */
  @DefaultMessage("matches pattern (exact case)")
  @Key("operators_matchesPatternTitle")
  String operators_matchesPatternTitle();

  /**
   * Translated "does not contain (match case)".
   * 
   * @return translated "does not contain (match case)"
   */
  @DefaultMessage("does not contain (match case)")
  @Key("operators_notContainsTitle")
  String operators_notContainsTitle();

  /**
   * Translated "does not end with (match case)".
   * 
   * @return translated "does not end with (match case)"
   */
  @DefaultMessage("does not end with (match case)")
  @Key("operators_notEndsWithTitle")
  String operators_notEndsWithTitle();

  /**
   * Translated "differs from field".
   * 
   * @return translated "differs from field"
   */
  @DefaultMessage("differs from field")
  @Key("operators_notEqualFieldTitle")
  String operators_notEqualFieldTitle();

  /**
   * Translated "not equal".
   * 
   * @return translated "not equal"
   */
  @DefaultMessage("not equal")
  @Key("operators_notEqualTitle")
  String operators_notEqualTitle();

  /**
   * Translated "is not one of".
   * 
   * @return translated "is not one of"
   */
  @DefaultMessage("is not one of")
  @Key("operators_notInSetTitle")
  String operators_notInSetTitle();

  /**
   * Translated "is not null".
   * 
   * @return translated "is not null"
   */
  @DefaultMessage("is not null")
  @Key("operators_notNullTitle")
  String operators_notNullTitle();

  /**
   * Translated "does not start with (match case)".
   * 
   * @return translated "does not start with (match case)"
   */
  @DefaultMessage("does not start with (match case)")
  @Key("operators_notStartsWithTitle")
  String operators_notStartsWithTitle();

  /**
   * Translated "Match None".
   * 
   * @return translated "Match None"
   */
  @DefaultMessage("Match None")
  @Key("operators_notTitle")
  String operators_notTitle();

  /**
   * Translated "Match Any".
   * 
   * @return translated "Match Any"
   */
  @DefaultMessage("Match Any")
  @Key("operators_orTitle")
  String operators_orTitle();

  /**
   * Translated "matches expression (exact case)".
   * 
   * @return translated "matches expression (exact case)"
   */
  @DefaultMessage("matches expression (exact case)")
  @Key("operators_regexpTitle")
  String operators_regexpTitle();

  /**
   * Translated "starts with (match case) another field value".
   * 
   * @return translated "starts with (match case) another field value"
   */
  @DefaultMessage("starts with (match case) another field value")
  @Key("operators_startsWithFieldTitle")
  String operators_startsWithFieldTitle();

  /**
   * Translated "starts with (match case)".
   * 
   * @return translated "starts with (match case)"
   */
  @DefaultMessage("starts with (match case)")
  @Key("operators_startsWithTitle")
  String operators_startsWithTitle();

  

  /**
   * Translated "matches other field (case insensitive)".
   * 
   * @return translated "matches other field (case insensitive)"
   */
  @DefaultMessage("matches other field (case insensitive)")
  @Key("operators_iEqualsFieldTitle")
  String operators_iEqualsFieldTitle();
  
  /**
   * Translated "differs from field (case insensitive)".
   * 
   * @return translated "differs from field (case insensitive)"
   */
  @DefaultMessage("differs from field (case insensitive)")
  @Key("operators_iNotEqualFieldTitle")
  String operators_iNotEqualFieldTitle();
  
  /**
   * Translated "contains (case insensitive) another field value".
   * 
   * @return translated "contains (case insensitive) another field value"
   */
  @DefaultMessage("contains (case insensitive) another field value")
  @Key("operators_iContainsFieldTitle")
  String operators_iContainsFieldTitle();
  
  /**
   * Translated "starts with (case insensitive) another field value".
   * 
   * @return translated "starts with (case insensitive) another field value"
   */
  @DefaultMessage("starts with (case insensitive) another field value")
  @Key("operators_iStartsWithFieldTitle")
  String operators_iStartsWithFieldTitle();

  /**
   * Translated "ends with (case insensitive) another field value".
   * 
   * @return translated "ends with (case insensitive) another field value"
   */
  @DefaultMessage("ends with (case insensitive) another field value")
  @Key("operators_iEndsWithFieldTitle")
  String operators_iEndsWithFieldTitle();

  /**
   * Translated "does not contain (case insensitive) another field value".
   * 
   * @return translated "does not contain (case insensitive) another field value"
   */
  @DefaultMessage("does not contain (match case) another field value")
  @Key("operators_notContainsFieldTitle")
  String operators_notContainsFieldTitle();

  /**
   * Translated "does not start with (match case) another field value".
   * 
   * @return translated "does not start with (match case) another field value"
   */
  @DefaultMessage("does not start with (match case) another field value")
  @Key("operators_notStartsWithFieldTitle")
  String operators_notStartsWithFieldTitle();

  /**
   * Translated "does not end with (match case) another field value".
   * 
   * @return translated "does not end with (match case) another field value"
   */
  @DefaultMessage("does not end with (match case) another field value")
  @Key("operators_notEndsWithFieldTitle")
  String operators_notEndsWithFieldTitle();

  /**
   * Translated "does not contain (case insensitive) another field value".
   * 
   * @return translated "does not contain (case insensitive) another field value"
   */
  @DefaultMessage("does not contain (case insensitive) another field value")
  @Key("operators_iNotContainsFieldTitle")
  String operators_iNotContainsFieldTitle();

  /**
   * Translated "does not start with (case insensitive) another field value".
   * 
   * @return translated "does not start with (case insensitive) another field value"
   */
  @DefaultMessage("does not start with (case insensitive) another field value")
  @Key("operators_iNotStartsWithFieldTitle")
  String operators_iNotStartsWithFieldTitle();

  /**
   * Translated "does not end with (case insensitive) another field value".
   * 
   * @return translated "does not end with (case insensitive) another field value"
   */
  @DefaultMessage("does not end with (case insensitive) another field value")
  @Key("operators_iNotEndsWithFieldTitle")
  String operators_iNotEndsWithFieldTitle();

  /**
   * Translated "contains pattern (exact case)".
   * 
   * @return translated "contains pattern (exact case)"
   */
  @DefaultMessage("contains pattern (exact case)")
  @Key("operators_containsPatternTitle")
  String operators_containsPatternTitle();
  
  /**
   * Translated "contains pattern".
   * 
   * @return translated "contains pattern"
   */
  @DefaultMessage("contains pattern")
  @Key("operators_iContainsPatternTitle")
  String operators_iContainsPatternTitle();
  
  /**
   * Translated "starts with pattern (exact case)".
   * 
   * @return translated "starts with pattern (exact case)"
   */
  @DefaultMessage("starts with pattern (exact case)")
  @Key("operators_startsWithPatternTitle")
  String operators_startsWithPatternTitle();
  
  /**
   * Translated "starts with pattern".
   * 
   * @return translated "starts with pattern"
   */
  @DefaultMessage("starts with pattern")
  @Key("operators_iStartsWithPatternTitle")
  String operators_iStartsWithPatternTitle();

   /**
   * Translated "ends with pattern (exact case)".
   * 
   * @return translated "ends with pattern (exact case)"
   */
  @DefaultMessage("ends with pattern (exact case)")
  @Key("operators_endsWithPatternTitle")
  String operators_endsWithPatternTitle();
  
  /**
   * Translated "ends with pattern".
   * 
   * @return translated "ends with pattern"
   */
  @DefaultMessage("ends with pattern")
  @Key("operators_iEndsWithPatternTitle")
  String operators_iEndsWithPatternTitle();
  
  /**
   * Translated "No Items To Show".
   * 
   * @return translated "No Items To Show"
   */
  @DefaultMessage("No Items To Show")
  @Key("pickListMenu_emptyMessage")
  String pickListMenu_emptyMessage();
  
  /**
   * Translated "No items to show".
   * 
   * @return translated "No items to show"
   */
  @DefaultMessage("No items to show")
  @Key("pickList_emptyPickListMessage")
  String pickList_emptyPickListMessage();

  /**
   * Translated "No items to show".
   * 
   * @return translated "No items to show"
   */
  @DefaultMessage("No items to show")
  @Key("selectItem_emptyPickListMessage")
  String selectItem_emptyPickListMessage();

  /**
   * Translated "Done".
   * 
   * @return translated "Done"
   */
  @DefaultMessage("Done")
  @Key("selectItem_pickerExitButtonTitle")
  String selectItem_pickerExitButtonTitle();

  /**
   * Translated "No items to show".
   * 
   * @return translated "No items to show"
   */
  @DefaultMessage("No items to show")
  @Key("comboBoxItem_emptyPickListMessage")
  String comboBoxItem_emptyPickListMessage();

  /**
   * Translated "Search".
   * 
   * @return translated "Search"
   */
  @DefaultMessage("Search")
  @Key("comboBoxItem_pickerSearchFieldHint")
  String comboBoxItem_pickerSearchFieldHint();

  /**
   * Translated "Cancel".
   * 
   * @return translated "Cancel"
   */
  @DefaultMessage("Cancel")
  @Key("comboBoxItem_pickerExitButtonTitle")
  String comboBoxItem_pickerExitButtonTitle();

  /**
   * Translated "Accept".
   * 
   * @return translated "Accept"
   */
  @DefaultMessage("Accept")
  @Key("comboBoxItem_pickerSaveButtonTitle")
  String comboBoxItem_pickerSaveButtonTitle();

  /**
   * Translated "[Empty menu]".
   * 
   * @return translated "[Empty menu]"
   */
  @DefaultMessage("[Empty menu]")
  @Key("menu_emptyMessage")
  String menu_emptyMessage();

  /**
   * Translated "No items to display".
   * 
   * @return translated "No items to display"
   */
  @DefaultMessage("No items to display")
  @Key("pickTreeItem_emptyMenuMessage")
  String pickTreeItem_emptyMenuMessage();

  /**
   * Translated "Print".
   * 
   * @return translated "Print"
   */
  @DefaultMessage("Print")
  @Key("printWindow_printButtonTitle")
  String printWindow_printButtonTitle();

  /**
   * Translated "Print Preview".
   * 
   * @return translated "Print Preview"
   */
  @DefaultMessage("Print Preview")
  @Key("printWindow_title")
  String printWindow_title();

  /**
   * Translated "N days ago".
   * 
   * @return translated "N days ago"
   */
  @DefaultMessage("N days ago")
  @Key("relativeDateItem_daysAgoTitle")
  String relativeDateItem_daysAgoTitle();

  /**
   * Translated "N days from now".
   * 
   * @return translated "N days from now"
   */
  @DefaultMessage("N days from now")
  @Key("relativeDateItem_daysFromNowTitle")
  String relativeDateItem_daysFromNowTitle();

  /**
   * Translated "N hours ago".
   * 
   * @return translated "N hours ago"
   */
  @DefaultMessage("N hours ago")
  @Key("relativeDateItem_hoursAgoTitle")
  String relativeDateItem_hoursAgoTitle();

  /**
   * Translated "N hours from now".
   * 
   * @return translated "N hours from now"
   */
  @DefaultMessage("N hours from now")
  @Key("relativeDateItem_hoursFromNowTitle")
  String relativeDateItem_hoursFromNowTitle();

  /**
   * Translated "N milliseconds ago".
   * 
   * @return translated "N milliseconds ago"
   */
  @DefaultMessage("N milliseconds ago")
  @Key("relativeDateItem_millisecondsAgoTitle")
  String relativeDateItem_millisecondsAgoTitle();

  /**
   * Translated "N milliseconds from now".
   * 
   * @return translated "N milliseconds from now"
   */
  @DefaultMessage("N milliseconds from now")
  @Key("relativeDateItem_millisecondsFromNowTitle")
  String relativeDateItem_millisecondsFromNowTitle();

  /**
   * Translated "N minutes ago".
   * 
   * @return translated "N minutes ago"
   */
  @DefaultMessage("N minutes ago")
  @Key("relativeDateItem_minutesAgoTitle")
  String relativeDateItem_minutesAgoTitle();

  /**
   * Translated "N minutes from now".
   * 
   * @return translated "N minutes from now"
   */
  @DefaultMessage("N minutes from now")
  @Key("relativeDateItem_minutesFromNowTitle")
  String relativeDateItem_minutesFromNowTitle();

  /**
   * Translated "N months ago".
   * 
   * @return translated "N months ago"
   */
  @DefaultMessage("N months ago")
  @Key("relativeDateItem_monthsAgoTitle")
  String relativeDateItem_monthsAgoTitle();

  /**
   * Translated "N months from now".
   * 
   * @return translated "N months from now"
   */
  @DefaultMessage("N months from now")
  @Key("relativeDateItem_monthsFromNowTitle")
  String relativeDateItem_monthsFromNowTitle();

  /**
   * Translated "N quarters ago".
   * 
   * @return translated "N quarters ago"
   */
  @DefaultMessage("N quarters ago")
  @Key("relativeDateItem_quartersAgoTitle")
  String relativeDateItem_quartersAgoTitle();

  /**
   * Translated "N quarters from now".
   * 
   * @return translated "N quarters from now"
   */
  @DefaultMessage("N quarters from now")
  @Key("relativeDateItem_quartersFromNowTitle")
  String relativeDateItem_quartersFromNowTitle();

  /**
   * Translated "Show Date Chooser".
   * 
   * @return translated "Show Date Chooser"
   */
  @DefaultMessage("Show Date Chooser")
  @Key("relativeDateItem_pickerIconPrompt")
  String relativeDateItem_pickerIconPrompt();

  /**
   * Translated "Current day of last month".
   * 
   * @return translated "Current day of last month"
   */
  @DefaultMessage("Current day of last month")
  @Key("relativeDateItem_presetOptions_minus_1m")
  String relativeDateItem_presetOptions_minus_1m();

  /**
   * Translated "Current day of last week".
   * 
   * @return translated "Current day of last week"
   */
  @DefaultMessage("Current day of last week")
  @Key("relativeDateItem_presetOptions_minus_1w")
  String relativeDateItem_presetOptions_minus_1w();

  /**
   * Translated "Current day of next month".
   * 
   * @return translated "Current day of next month"
   */
  @DefaultMessage("Current day of next month")
  @Key("relativeDateItem_presetOptions_plus_1m")
  String relativeDateItem_presetOptions_plus_1m();

  /**
   * Translated "Current day of next week".
   * 
   * @return translated "Current day of next week"
   */
  @DefaultMessage("Current day of next week")
  @Key("relativeDateItem_presetOptions_plus_1w")
  String relativeDateItem_presetOptions_plus_1w();

  /**
   * Translated "Today".
   * 
   * @return translated "Today"
   */
  @DefaultMessage("Today")
  @Key("relativeDateItem_presetOptions_today")
  String relativeDateItem_presetOptions_today();

  /**
   * Translated "Tomorrow".
   * 
   * @return translated "Tomorrow"
   */
  @DefaultMessage("Tomorrow")
  @Key("relativeDateItem_presetOptions_tomorrow")
  String relativeDateItem_presetOptions_tomorrow();

  /**
   * Translated "Yesterday".
   * 
   * @return translated "Yesterday"
   */
  @DefaultMessage("Yesterday")
  @Key("relativeDateItem_presetOptions_yesterday")
  String relativeDateItem_presetOptions_yesterday();

  /**
   * Translated "N seconds ago".
   * 
   * @return translated "N seconds ago"
   */
  @DefaultMessage("N seconds ago")
  @Key("relativeDateItem_secondsAgoTitle")
  String relativeDateItem_secondsAgoTitle();

  /**
   * Translated "N seconds from now".
   * 
   * @return translated "N seconds from now"
   */
  @DefaultMessage("N seconds from now")
  @Key("relativeDateItem_secondsFromNowTitle")
  String relativeDateItem_secondsFromNowTitle();

  /**
   * Translated "Today".
   * 
   * @return translated "Today"
   */
  @DefaultMessage("Today")
  @Key("relativeDateItem_todayTitle")
  String relativeDateItem_todayTitle();

  /**
   * Translated "N weeks ago".
   * 
   * @return translated "N weeks ago"
   */
  @DefaultMessage("N weeks ago")
  @Key("relativeDateItem_weeksAgoTitle")
  String relativeDateItem_weeksAgoTitle();

  /**
   * Translated "N weeks from now".
   * 
   * @return translated "N weeks from now"
   */
  @DefaultMessage("N weeks from now")
  @Key("relativeDateItem_weeksFromNowTitle")
  String relativeDateItem_weeksFromNowTitle();

  /**
   * Translated "N years ago".
   * 
   * @return translated "N years ago"
   */
  @DefaultMessage("N years ago")
  @Key("relativeDateItem_yearsAgoTitle")
  String relativeDateItem_yearsAgoTitle();

  /**
   * Translated "N years from now".
   * 
   * @return translated "N years from now"
   */
  @DefaultMessage("N years from now")
  @Key("relativeDateItem_yearsFromNowTitle")
  String relativeDateItem_yearsFromNowTitle();

  /**
   * Translated "Center selection".
   * 
   * @return translated "Center selection"
   */
  @DefaultMessage("Center selection")
  @Key("richTextEditor_alignCenterPrompt")
  String richTextEditor_alignCenterPrompt();

  /**
   * Translated "Left align selection".
   * 
   * @return translated "Left align selection"
   */
  @DefaultMessage("Left align selection")
  @Key("richTextEditor_alignLeftPrompt")
  String richTextEditor_alignLeftPrompt();

  /**
   * Translated "Right align selection".
   * 
   * @return translated "Right align selection"
   */
  @DefaultMessage("Right align selection")
  @Key("richTextEditor_alignRightPrompt")
  String richTextEditor_alignRightPrompt();

  /**
   * Translated "Set selection background color".
   * 
   * @return translated "Set selection background color"
   */
  @DefaultMessage("Set selection background color")
  @Key("richTextEditor_backgroundColorPrompt")
  String richTextEditor_backgroundColorPrompt();

  /**
   * Translated "Make selection bold".
   * 
   * @return translated "Make selection bold"
   */
  @DefaultMessage("Make selection bold")
  @Key("richTextEditor_boldSelectionPrompt")
  String richTextEditor_boldSelectionPrompt();

  /**
   * Translated "Set selection color".
   * 
   * @return translated "Set selection color"
   */
  @DefaultMessage("Set selection color")
  @Key("richTextEditor_colorPrompt")
  String richTextEditor_colorPrompt();

  /**
   * Translated "Copy Selection".
   * 
   * @return translated "Copy Selection"
   */
  @DefaultMessage("Copy Selection")
  @Key("richTextEditor_copySelectionPrompt")
  String richTextEditor_copySelectionPrompt();

  /**
   * Translated "Cut Selection".
   * 
   * @return translated "Cut Selection"
   */
  @DefaultMessage("Cut Selection")
  @Key("richTextEditor_cutSelectionPrompt")
  String richTextEditor_cutSelectionPrompt();

  /**
   * Translated "Set Font ...".
   * 
   * @return translated "Set Font ..."
   */
  @DefaultMessage("Set Font ...")
  @Key("richTextEditor_fontPrompt")
  String richTextEditor_fontPrompt();

  /**
   * Translated "Set Font Size ...".
   * 
   * @return translated "Set Font Size ..."
   */
  @DefaultMessage("Set Font Size ...")
  @Key("richTextEditor_fontSizePrompt")
  String richTextEditor_fontSizePrompt();

  /**
   * Translated "Indent selection".
   * 
   * @return translated "Indent selection"
   */
  @DefaultMessage("Indent selection")
  @Key("richTextEditor_indentSelectionPrompt")
  String richTextEditor_indentSelectionPrompt();

  /**
   * Translated "Make selection italic".
   * 
   * @return translated "Make selection italic"
   */
  @DefaultMessage("Make selection italic")
  @Key("richTextEditor_italicSelectionPrompt")
  String richTextEditor_italicSelectionPrompt();

  /**
   * Translated "Full justify selection".
   * 
   * @return translated "Full justify selection"
   */
  @DefaultMessage("Full justify selection")
  @Key("richTextEditor_justifyPrompt")
  String richTextEditor_justifyPrompt();

  /**
   * Translated "Edit hyperlink".
   * 
   * @return translated "Edit hyperlink"
   */
  @DefaultMessage("Edit hyperlink")
  @Key("richTextEditor_linkPrompt")
  String richTextEditor_linkPrompt();

  /**
   * Translated "Hyperlink URL:".
   * 
   * @return translated "Hyperlink URL:"
   */
  @DefaultMessage("Hyperlink URL:")
  @Key("richTextEditor_linkUrlTitle")
  String richTextEditor_linkUrlTitle();

  /**
   * Translated "Decrease selection indent".
   * 
   * @return translated "Decrease selection indent"
   */
  @DefaultMessage("Decrease selection indent")
  @Key("richTextEditor_outdentSelectionPrompt")
  String richTextEditor_outdentSelectionPrompt();

  /**
   * Translated "Paste Selection".
   * 
   * @return translated "Paste Selection"
   */
  @DefaultMessage("Paste Selection")
  @Key("richTextEditor_pasteSelectionPrompt")
  String richTextEditor_pasteSelectionPrompt();

  /**
   * Translated "Make selection underlined".
   * 
   * @return translated "Make selection underlined"
   */
  @DefaultMessage("Make selection underlined")
  @Key("richTextEditor_underlineSelectionPrompt")
  String richTextEditor_underlineSelectionPrompt();

  /**
   * Translated "Contacting Server...".
   * 
   * @return translated "Contacting Server..."
   */
  @DefaultMessage("Contacting Server...")
  @Key("rpcManager_defaultPrompt")
  String rpcManager_defaultPrompt();

  /**
   * Translated "Finding Records that match your criteria...".
   * 
   * @return translated "Finding Records that match your criteria..."
   */
  @DefaultMessage("Finding Records that match your criteria...")
  @Key("rpcManager_fetchDataPrompt")
  String rpcManager_fetchDataPrompt();

  /**
   * Translated "Deleting Record(s)...".
   * 
   * @return translated "Deleting Record(s)..."
   */
  @DefaultMessage("Deleting Record(s)...")
  @Key("rpcManager_removeDataPrompt")
  String rpcManager_removeDataPrompt();

  /**
   * Translated "Saving form...".
   * 
   * @return translated "Saving form..."
   */
  @DefaultMessage("Saving form...")
  @Key("rpcManager_saveDataPrompt")
  String rpcManager_saveDataPrompt();

  /**
   * Translated "Operation timed out".
   * 
   * @return translated "Operation timed out"
   */
  @DefaultMessage("Operation timed out")
  @Key("rpcManager_timeoutErrorMessage")
  String rpcManager_timeoutErrorMessage();

  /**
   * Translated "Validating...".
   * 
   * @return translated "Validating..."
   */
  @DefaultMessage("Validating...")
  @Key("rpcManager_validateDataPrompt")
  String rpcManager_validateDataPrompt();

  /**
   * Translated "Other...".
   * 
   * @return translated "Other..."
   */
  @DefaultMessage("Other...")
  @Key("selectOtherItem_otherTitle")
  String selectOtherItem_otherTitle();

  /**
   * Translated "Other value for".
   * 
   * @return translated "Other value for"
   */
  @DefaultMessage("Other value for")
  @Key("selectOtherItem_selectOtherPrompt")
  String selectOtherItem_selectOtherPrompt();

  /**
   * Translated "Can''t select that many records at once.<br><br>Please try working in smaller batches.".
   * 
   * @return translated "Can''t select that many records at once.<br><br>Please try working in smaller batches."
   */
  @DefaultMessage("Can''t select that many records at once.<br><br>Please try working in smaller batches.")
  @Key("selection_selectionRangeNotLoadedMessage")
  String selection_selectionRangeNotLoadedMessage();

  /**
   * Translated "Auto hide fields used in summary".
   * 
   * @return translated "Auto hide fields used in summary"
   */
  @DefaultMessage("Auto hide fields used in summary")
  @Key("summaryBuilder_autoHideCheckBoxLabel")
  String summaryBuilder_autoHideCheckBoxLabel();

  /**
   * Translated "Summary".
   * 
   * @return translated "Summary"
   */
  @DefaultMessage("Summary")
  @Key("summaryBuilder_builderTypeText")
  String summaryBuilder_builderTypeText();

  /**
   * Translated "Building Summary Columns".
   * 
   * @return translated "Building Summary Columns"
   */
  @DefaultMessage("Building Summary Columns")
  @Key("summaryBuilder_helpTextIntro")
  String summaryBuilder_helpTextIntro();

  /**
   * Translated ", closeable".
   * 
   * @return translated ", closeable"
   */
  @DefaultMessage(", closeable")
  @Key("tabSet_ariaCloseableSuffix")
  String tabSet_ariaCloseableSuffix();

  /**
   * Translated "am".
   * 
   * @return translated "am"
   */
  @DefaultMessage("am")
  @Key("time_AMIndicator")
  String time_AMIndicator();

  /**
   * Translated "pm".
   * 
   * @return translated "pm"
   */
  @DefaultMessage("pm")
  @Key("time_PMIndicator")
  String time_PMIndicator();

  /**
   * Translated "You can''t drag an item into one of it''s children.".
   * 
   * @return translated "You can''t drag an item into one of it''s children."
   */
  @DefaultMessage("You can''t drag an item into one of it''s children.")
  @Key("treeGrid_cantDragIntoChildMessage")
  String treeGrid_cantDragIntoChildMessage();

  /**
   * Translated "You can''t drag an item into itself.".
   * 
   * @return translated "You can''t drag an item into itself."
   */
  @DefaultMessage("You can''t drag an item into itself.")
  @Key("treeGrid_cantDragIntoSelfMessage")
  String treeGrid_cantDragIntoSelfMessage();

  /**
   * Translated "This item already contains a child item with that name.".
   * 
   * @return translated "This item already contains a child item with that name."
   */
  @DefaultMessage("This item already contains a child item with that name.")
  @Key("treeGrid_parentAlreadyContainsChildMessage")
  String treeGrid_parentAlreadyContainsChildMessage();

  /**
   * Translated "This data not available while offline.".
   * 
   * @return translated "This data not available while offline."
   */
  @DefaultMessage("This data not available while offline.")
  @Key("treeGrid_offlineNodeMessage")
  String treeGrid_offlineNodeMessage();

  /**
   * Translated "Back".
   * 
   * @return translated "Back."
   */
  @DefaultMessage("Back.")
  @Key("columnTree_backButtonTitle")
  String columnTree_backButtonTitle();

  /**
   * Translated "Must be earlier than".
   * 
   * @return translated "Must be earlier than"
   */
  @DefaultMessage("Must be earlier than")
  @Key("validator_mustBeEarlierThan")
  String validator_mustBeEarlierThan();

  /**
   * Translated "Must be exactly $max characters".
   * 
   * @return translated "Must be exactly $max characters"
   */
  @DefaultMessage("Must be exactly $max characters")
  @Key("validator_mustBeExactLength")
  String validator_mustBeExactLength();

  /**
   * Translated "Must be at least ".
   * 
   * @return translated "Must be at least "
   */
  @DefaultMessage("Must be at least ")
  @Key("validator_mustBeGreaterThan")
  String validator_mustBeGreaterThan();

  /**
   * Translated "Must be later than".
   * 
   * @return translated "Must be later than"
   */
  @DefaultMessage("Must be later than")
  @Key("validator_mustBeLaterThan")
  String validator_mustBeLaterThan();

  /**
   * Translated "Must be no more than".
   * 
   * @return translated "Must be no more than"
   */
  @DefaultMessage("Must be no more than")
  @Key("validator_mustBeLessThan")
  String validator_mustBeLessThan();

  /**
   * Translated "Must be at least $min characters".
   * 
   * @return translated "Must be at least $min characters"
   */
  @DefaultMessage("Must be at least $min characters")
  @Key("validator_mustBeLongerThan")
  String validator_mustBeLongerThan();

  /**
   * Translated "Must be less than $max characters".
   * 
   * @return translated "Must be less than $max characters"
   */
  @DefaultMessage("Must be less than $max characters")
  @Key("validator_mustBeShorterThan")
  String validator_mustBeShorterThan();

  /**
   * Translated "Must be a true/false value.".
   * 
   * @return translated "Must be a true/false value."
   */
  @DefaultMessage("Must be a true/false value.")
  @Key("validator_notABoolean")
  String validator_notABoolean();

  /**
   * Translated "Must be a CSS color identifier.".
   * 
   * @return translated "Must be a CSS color identifier."
   */
  @DefaultMessage("Must be a CSS color identifier.")
  @Key("validator_notAColor")
  String validator_notAColor();

  /**
   * Translated "Must be a date.".
   * 
   * @return translated "Must be a date."
   */
  @DefaultMessage("Must be a date.")
  @Key("validator_notADate")
  String validator_notADate();

  /**
   * Translated "Must be a valid decimal.".
   * 
   * @return translated "Must be a valid decimal."
   */
  @DefaultMessage("Must be a valid decimal.")
  @Key("validator_notADecimal")
  String validator_notADecimal();

  /**
   * Translated "Must be a function.".
   * 
   * @return translated "Must be a function."
   */
  @DefaultMessage("Must be a function.")
  @Key("validator_notAFunction")
  String validator_notAFunction();

  /**
   * Translated "Must be a valid regular expression.".
   * 
   * @return translated "Must be a valid regular expression."
   */
  @DefaultMessage("Must be a valid regular expression.")
  @Key("validator_notARegex")
  String validator_notARegex();

  /**
   * Translated "Must be a String.".
   * 
   * @return translated "Must be a String."
   */
  @DefaultMessage("Must be a String.")
  @Key("validator_notAString")
  String validator_notAString();

  /**
   * Translated "Must be a time.".
   * 
   * @return translated "Must be a time."
   */
  @DefaultMessage("Must be a time.")
  @Key("validator_notATime")
  String validator_notATime();

  /**
   * Translated "Identifiers must start with a letter, underscore or $ character, and may contain only letters, numbers, underscores or $ characters.".
   * 
   * @return translated "Identifiers must start with a letter, underscore or $ character, and may contain only letters, numbers, underscores or $ characters."
   */
  @DefaultMessage("Identifiers must start with a letter, underscore or $ character, and may contain only letters, numbers, underscores or $ characters.")
  @Key("validator_notAnIdentifier")
  String validator_notAnIdentifier();

  /**
   * Translated "Must be a whole number.".
   * 
   * @return translated "Must be a whole number."
   */
  @DefaultMessage("Must be a whole number.")
  @Key("validator_notAnInteger")
  String validator_notAnInteger();

  /**
   * Translated "Not a valid option".
   * 
   * @return translated "Not a valid option"
   */
  @DefaultMessage("Not a valid option")
  @Key("validator_notOneOf")
  String validator_notOneOf();

  /**
   * Translated "Field is required".
   * 
   * @return translated "Field is required"
   */
  @DefaultMessage("Field is required")
  @Key("validator_requiredField")
  String validator_requiredField();

  /**
   * Translated "Must be later than $min".
   * 
   * @return translated "Must be later than $min"
   */
  @DefaultMessage("Must be later than $min")
  @Key("validator_mustBeLaterThanTime")
  String validator_mustBeLaterThanTime();

  /**
   * Translated "Must be earlier than $max".
   * 
   * @return translated "Must be earlier than $max"
   */
  @DefaultMessage("Must be earlier than $max")
  @Key("validator_mustBeEarlierThanTime")
  String validator_mustBeEarlierThanTime();

  /**
   * Translated "Untitled Window".
   * 
   * @return translated "Untitled Window"
   */
  @DefaultMessage("Untitled Window")
  @Key("window_title")
  String window_title();
}

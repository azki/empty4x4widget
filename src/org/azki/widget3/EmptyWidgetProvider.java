package org.azki.widget3;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

public class EmptyWidgetProvider extends AppWidgetProvider {
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		super.onUpdate(context, appWidgetManager, appWidgetIds);
		RemoteViews updateViews = new RemoteViews(context.getPackageName(),
				R.layout.layout);
		appWidgetManager.updateAppWidget(appWidgetIds[appWidgetIds.length - 1], updateViews);
	}
}

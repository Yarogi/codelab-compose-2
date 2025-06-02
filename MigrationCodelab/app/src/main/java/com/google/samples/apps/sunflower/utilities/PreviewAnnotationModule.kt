package com.google.samples.apps.sunflower.utilities

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, widthDp = 320)
annotation class SmallDevicePreview

@Preview(showBackground = true, widthDp = 320, uiMode = Configuration.UI_MODE_NIGHT_YES)
annotation class SmallDevicePreviewNightMode
package ua.education.pagertest

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ua.education.pagertest.screen.OnboardingPagerScreen
import ua.education.pagertest.theme.AppTheme

@Composable
@Preview
fun App() {
    AppTheme {
        OnboardingPagerScreen()
    }
}
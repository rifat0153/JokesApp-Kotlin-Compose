//package com.example.jokesapp.presentation.home
//
//import androidx.annotation.StringRes
//import androidx.compose.material.BottomNavigation
//import androidx.compose.material.BottomNavigationItem
//import androidx.compose.material.Text
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Email
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.res.stringResource
//import androidx.navigation.NavController
//import androidx.navigation.compose.currentBackStackEntryAsState
//import com.example.jokesapp.R
//import com.example.jokesapp.presentation.destinations.Destination
//import com.example.jokesapp.presentation.destinations.QuizDetailScreenDestination
//import com.example.jokesapp.presentation.destinations.QuizScreenDestination
//import com.example.jokesapp.presentation.navDestination
//import com.ramcosta.composedestinations.navigation.navigateTo
//import androidx.compose.material.Icon
//import androidx.compose.ui.graphics.vector.ImageVector
//
//enum class BottomBarDestination(
//    val direction: DirectionDestinationSpec,
//    val icon: ImageVector,
//    @StringRes val label: Int
//) {
//    Quiz(QuizScreenDestination, Icons.Default.Home, R.string.home),
//    QuizDetail(QuizDetailScreenDestination, Icons.Default.Email, R.string.email),
//}
//
//@Composable
//fun BottomBar(
//    navController: NavController
//) {
//    val currentDestination: Destination? = navController.currentBackStackEntryAsState()
//        .value?.navDestination
//
//    BottomNavigation() {
//        BottomBarDestination.values().forEach { destination ->
//            BottomNavigationItem(
//                selected = currentDestination == destination.direction,
//                onClick = {
//                    navController.navigateTo(destination.direction) {
//                        launchSingleTop = true
//                    }
//                },
//                icon = {
//                    Icon(
//                        destination.icon,
//                        contentDescription = stringResource(destination.label)
//                    )
//                }, label = { Text(stringResource(destination.label)) },
//            )
//        }
//    }
//}
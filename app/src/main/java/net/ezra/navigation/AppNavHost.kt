package net.ezra.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.About.SettingsScreen
import net.ezra.ui.Products.ProfileScreen
import net.ezra.ui.SplashScreen

//import net.ezra.ui.VIDEOS.VideoListScreen
//import net.ezra.ui.VIDEOS.VideoUploadScreen
//import net.ezra.ui.Registration.Registration
import net.ezra.ui.auth.LoginScreen
import net.ezra.ui.auth.SignUpScreen
import net.ezra.ui.exercises.JumpingJackScreen
import net.ezra.ui.mit.MitScreen
//import net.ezra.ui.products.ProductsScreen
import net.ezra.ui.services.ServicesScreen
import net.ezra.ui.shop.HomeScreen
import net.ezra.ui.shop.ShopScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = net.ezra.navigation.ROUTE_SPLASH


) {
    BackHandler {
        navController.popBackStack()

        }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {


        composable(ROUTE_LOGIN) {
            LoginScreen(navController = navController){}
        }


        composable(ROUTE_SIGNUP) {
            net.ezra.ui.auth.SignUpScreen(navController = navController){}
        }


        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }


//        composable(net.ezra.navigation.ROUTE_ABOUT) {
//            AboutScreen(navController)
//        }

        composable(ROUTE_SERVICES) {
            ServicesScreen(navController)
        }

        composable(ROUTE_MIT) {
            MitScreen(navController)
        }
//
//        composable(ROUTE_CONTACT) {
//            ContactScreen(navController)
//        }

        composable(ROUTE_SHOP) {
            ShopScreen(navController)
        }

        composable(ROUTE_PROFILE) {
           ProfileScreen(navController = navController)
        }

        composable(ROUTE_EVENING) {
            SettingsScreen( navController = navController)
        }

        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }

//        composable(ROUTE_VIEW) {
//            VideoListScreen(navController)
//        }

//        composable(ROUTE_UPLOAD) {
//            VideoUploadScreen(navController)
//        }

//        composable(ROUTE_JUMPINGJACKSCREEN) {
//           JumpingJackScreen(navController = navController)
//        }

































    }
}

@Composable
fun EveningScreen(navController: NavHostController) {

}

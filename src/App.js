import React from 'react';
import TopBar from './components/topbar/TopBar';
import Home from "./pages/home/Home";
import Login from './pages/login/Login';
import Register from './pages/register/Register';
import Settings from './pages/settings/Settings';
import Single from './pages/single/Single';
import Write from './pages/write/Write';

function App() {
  return (
    <>
      <TopBar/>
      <Register/>
    </>
  );
}

/**
 * 
 * <TopBar/>
 * <Write/>
 * <Setting/>
 * <Header/>
 * <Post/>
 * <Posts/>
 * <Sidebar/>
 * <SinglePost/>
 * <TopBar/> 
 * <Login/>
 * <Register/>
 */

export default App;

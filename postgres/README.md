





<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
  <link rel="dns-prefetch" href="https://assets-cdn.github.com">
  <link rel="dns-prefetch" href="https://avatars0.githubusercontent.com">
  <link rel="dns-prefetch" href="https://avatars1.githubusercontent.com">
  <link rel="dns-prefetch" href="https://avatars2.githubusercontent.com">
  <link rel="dns-prefetch" href="https://avatars3.githubusercontent.com">
  <link rel="dns-prefetch" href="https://github-cloud.s3.amazonaws.com">
  <link rel="dns-prefetch" href="https://user-images.githubusercontent.com/">



  <link crossorigin="anonymous" media="all" integrity="sha512-KDTN+N5tDqyAVqiTL8LuAYfCS2kKztX/cdejhBZu3hP7LuROj3O9LtASLb9ZMY5YALygmwk3Y5s1hy1vWLGtQg==" rel="stylesheet" href="https://assets-cdn.github.com/assets/frameworks-8f281eb0a8d2308ceb36e714ba3c3aec.css" />
  <link crossorigin="anonymous" media="all" integrity="sha512-Dws/XYP8XyKA2BebiTzkcOkV6LGf1600T5VAkKWEfXjX1lIHLaglXZa56Qa+fOSe4IPjtfn+LvztJvtbw7By8A==" rel="stylesheet" href="https://assets-cdn.github.com/assets/github-cec46cb7e4a6c4b4c35e2dac77b2196d.css" />
  
  
  
  

  <meta name="viewport" content="width=device-width">
  
  <title>docker-postgresql/README.md at master · sameersbn/docker-postgresql</title>
    <meta name="description" content="GitHub is where people build software. More than 27 million people use GitHub to discover, fork, and contribute to over 80 million projects.">
  <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
  <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
  <meta property="fb:app_id" content="1401488693436528">

    
    <meta property="og:image" content="https://avatars2.githubusercontent.com/u/410147?s=400&amp;v=4" /><meta property="og:site_name" content="GitHub" /><meta property="og:type" content="object" /><meta property="og:title" content="sameersbn/docker-postgresql" /><meta property="og:url" content="https://github.com/sameersbn/docker-postgresql" /><meta property="og:description" content="docker-postgresql - Dockerfile to build a PostgreSQL container image which can be linked to other containers." />

  <link rel="assets" href="https://assets-cdn.github.com/">
  <link rel="web-socket" href="wss://live.github.com/_sockets/VjI6MjUxOTYxMTczOjY2ZDY2YTZiNzkxM2UyMTY0Y2ViM2RiMDMyNGUxMDI1MTAyZjllMDMwMjRkMDM0NDQ1ODZkNjQwZDUwZDQ2MzM=--d81cdb84762df6ca3268db38b3199d5364306b86">
  <meta name="pjax-timeout" content="1000">
  <link rel="sudo-modal" href="/sessions/sudo_modal">
  <meta name="request-id" content="A0F4:0A79:9CF3F0:E5FF59:5AC81671" data-pjax-transient>


  

  <meta name="selected-link" value="repo_source" data-pjax-transient>

    <meta name="google-site-verification" content="KT5gs8h0wvaagLKAVWq8bbeNwnZZK1r1XQysX3xurLU">
  <meta name="google-site-verification" content="ZzhVyEFwb7w3e0-uOTltm8Jsck2F5StVihD0exw2fsA">
  <meta name="google-site-verification" content="GXs5KoUUkNCoaAZn7wPN-t01Pywp9M3sEjnt_3_ZWPc">
    <meta name="google-analytics" content="UA-3769691-2">

<meta name="octolytics-host" content="collector.githubapp.com" /><meta name="octolytics-app-id" content="github" /><meta name="octolytics-event-url" content="https://collector.githubapp.com/github-external/browser_event" /><meta name="octolytics-dimension-request_id" content="A0F4:0A79:9CF3F0:E5FF59:5AC81671" /><meta name="octolytics-dimension-region_edge" content="ap-southeast-1" /><meta name="octolytics-dimension-region_render" content="iad" /><meta name="octolytics-actor-id" content="35593087" /><meta name="octolytics-actor-login" content="chinvnal" /><meta name="octolytics-actor-hash" content="14be1227a575f1a604ce65f8fa13fe2c35baaaf9cd9164239f415517e1e09869" />
<meta name="hydro-events-url" content="https://github.com/hydro_browser_events" />
<meta name="analytics-location" content="/&lt;user-name&gt;/&lt;repo-name&gt;/blob/show" data-pjax-transient="true" />




  <meta class="js-ga-set" name="dimension1" content="Logged In">


  

      <meta name="hostname" content="github.com">
    <meta name="user-login" content="chinvnal">

      <meta name="expected-hostname" content="github.com">
    <meta name="js-proxy-site-detection-payload" content="NTY1OTQyYzNjNWNmZjQ1NTZiNmVlYTJjNDBmMzEyZDMwMTFhYjViM2Y4NDVhYjIzNzkzYjJjZTU3YmM4ZmE5NXx7InJlbW90ZV9hZGRyZXNzIjoiMTQuMjMxLjEyOS4yMDIiLCJyZXF1ZXN0X2lkIjoiQTBGNDowQTc5OjlDRjNGMDpFNUZGNTk6NUFDODE2NzEiLCJ0aW1lc3RhbXAiOjE1MjMwNjIzODksImhvc3QiOiJnaXRodWIuY29tIn0=">

    <meta name="enabled-features" content="UNIVERSE_BANNER,FREE_TRIALS,MARKETPLACE_INSIGHTS,MARKETPLACE_SELF_SERVE,MARKETPLACE_INSIGHTS_CONVERSION_PERCENTAGES">

  <meta name="html-safe-nonce" content="411d42515ca790279f1095edad88c1ab656b875d">

  <meta http-equiv="x-pjax-version" content="42baee944dfc4a2b2199a7e86e2621c9">
  

      <link href="https://github.com/sameersbn/docker-postgresql/commits/master.atom" rel="alternate" title="Recent Commits to docker-postgresql:master" type="application/atom+xml">

  <meta name="description" content="docker-postgresql - Dockerfile to build a PostgreSQL container image which can be linked to other containers.">
  <meta name="go-import" content="github.com/sameersbn/docker-postgresql git https://github.com/sameersbn/docker-postgresql.git">

  <meta name="octolytics-dimension-user_id" content="410147" /><meta name="octolytics-dimension-user_login" content="sameersbn" /><meta name="octolytics-dimension-repository_id" content="18726133" /><meta name="octolytics-dimension-repository_nwo" content="sameersbn/docker-postgresql" /><meta name="octolytics-dimension-repository_public" content="true" /><meta name="octolytics-dimension-repository_is_fork" content="false" /><meta name="octolytics-dimension-repository_network_root_id" content="18726133" /><meta name="octolytics-dimension-repository_network_root_nwo" content="sameersbn/docker-postgresql" /><meta name="octolytics-dimension-repository_explore_github_marketplace_ci_cta_shown" content="false" />


    <link rel="canonical" href="https://github.com/sameersbn/docker-postgresql/blob/master/README.md" data-pjax-transient>


  <meta name="browser-stats-url" content="https://api.github.com/_private/browser/stats">

  <meta name="browser-errors-url" content="https://api.github.com/_private/browser/errors">

  <link rel="mask-icon" href="https://assets-cdn.github.com/pinned-octocat.svg" color="#000000">
  <link rel="icon" type="image/x-icon" class="js-site-favicon" href="https://assets-cdn.github.com/favicon.ico">

<meta name="theme-color" content="#1e2327">


  <meta name="u2f-support" content="true">

<link rel="manifest" href="/manifest.json" crossOrigin="use-credentials">

  </head>

  <body class="logged-in env-production page-blob">
    

  <div class="position-relative js-header-wrapper ">
    <a href="#start-of-content" tabindex="1" class="p-3bg-blue text-white show-on-focus js-skip-to-content">Skip to content</a>
    <div id="js-pjax-loader-bar" class="pjax-loader-bar"><div class="progress"></div></div>

    
    
    



        
<header class="Header  f5" role="banner">
  <div class="d-flex flex-justify-between px-3 container-lg">
    <div class="d-flex flex-justify-between ">
      <div class="">
        <a class="header-logo-invertocat" href="https://github.com/" data-hotkey="g d" aria-label="Homepage" data-ga-click="Header, go to dashboard, icon:logo">
  <svg height="32" class="octicon octicon-mark-github" viewBox="0 0 16 16" version="1.1" width="32" aria-hidden="true"><path fill-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z"/></svg>
</a>

      </div>

    </div>

    <div class="HeaderMenu d-flex flex-justify-between flex-auto">
      <div class="d-flex">
            <div class="">
              <div class="header-search scoped-search site-scoped-search js-site-search" role="search">
  <!-- '"` --><!-- </textarea></xmp> --></option></form><form class="js-site-search-form" data-scoped-search-url="/sameersbn/docker-postgresql/search" data-unscoped-search-url="/search" action="/sameersbn/docker-postgresql/search" accept-charset="UTF-8" method="get"><input name="utf8" type="hidden" value="&#x2713;" />
    <label class="form-control header-search-wrapper  js-chromeless-input-container">
        <a class="header-search-scope no-underline" href="/sameersbn/docker-postgresql/blob/master/README.md">This repository</a>
      <input type="text"
        class="form-control header-search-input  js-site-search-focus js-site-search-field is-clearable"
        data-hotkey="s,/"
        name="q"
        value=""
        placeholder="Search"
        aria-label="Search this repository"
        data-unscoped-placeholder="Search GitHub"
        data-scoped-placeholder="Search"
        autocapitalize="off"
        >
        <input type="hidden" class="js-site-search-type-field" name="type" >
    </label>
</form></div>

            </div>

          <ul class="d-flex pl-2 flex-items-center text-bold list-style-none" role="navigation">
            <li>
              <a class="js-selected-navigation-item HeaderNavlink px-2" data-hotkey="g p" data-ga-click="Header, click, Nav menu - item:pulls context:user" aria-label="Pull requests you created" data-selected-links="/pulls /pulls/assigned /pulls/mentioned /pulls" href="/pulls">
                Pull requests
</a>            </li>
            <li>
              <a class="js-selected-navigation-item HeaderNavlink px-2" data-hotkey="g i" data-ga-click="Header, click, Nav menu - item:issues context:user" aria-label="Issues you created" data-selected-links="/issues /issues/assigned /issues/mentioned /issues" href="/issues">
                Issues
</a>            </li>
                <li>
                  <a class="js-selected-navigation-item HeaderNavlink px-2" data-ga-click="Header, click, Nav menu - item:marketplace context:user" data-selected-links=" /marketplace" href="/marketplace">
                    Marketplace
</a>                </li>
            <li>
              <a class="js-selected-navigation-item HeaderNavlink px-2" data-ga-click="Header, click, Nav menu - item:explore" data-selected-links="/explore /trending /trending/developers /integrations /integrations/feature/code /integrations/feature/collaborate /integrations/feature/ship showcases showcases_search showcases_landing /explore" href="/explore">
                Explore
</a>            </li>
          </ul>
      </div>

      <div class="d-flex">
        
<ul class="user-nav d-flex flex-items-center list-style-none" id="user-links">
  <li class="dropdown js-menu-container">
    <span class="d-inline-block  px-2">
      
    <a aria-label="You have no unread notifications" class="notification-indicator tooltipped tooltipped-s  js-socket-channel js-notification-indicator" data-hotkey="g n" data-ga-click="Header, go to notifications, icon:read" data-channel="notification-changed:35593087" href="/notifications">
        <span class="mail-status "></span>
        <svg class="octicon octicon-bell" viewBox="0 0 14 16" version="1.1" width="14" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M14 12v1H0v-1l.73-.58c.77-.77.81-2.55 1.19-4.42C2.69 3.23 6 2 6 2c0-.55.45-1 1-1s1 .45 1 1c0 0 3.39 1.23 4.16 5 .38 1.88.42 3.66 1.19 4.42l.66.58H14zm-7 4c1.11 0 2-.89 2-2H5c0 1.11.89 2 2 2z"/></svg>
</a>
    </span>
  </li>

  <li class="dropdown js-menu-container">
    <details class="dropdown-details details-reset js-dropdown-details d-flex px-2 flex-items-center">
      <summary class="HeaderNavlink"
         aria-label="Create new…"
         data-ga-click="Header, create new, icon:add">
        <svg class="octicon octicon-plus float-left mr-1 mt-1" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 9H7v5H5V9H0V7h5V2h2v5h5z"/></svg>
        <span class="dropdown-caret mt-1"></span>
      </summary>

      <ul class="dropdown-menu dropdown-menu-sw">
        
<a class="dropdown-item" href="/new" data-ga-click="Header, create new repository">
  New repository
</a>

  <a class="dropdown-item" href="/new/import" data-ga-click="Header, import a repository">
    Import repository
  </a>

<a class="dropdown-item" href="https://gist.github.com/" data-ga-click="Header, create new gist">
  New gist
</a>

  <a class="dropdown-item" href="/organizations/new" data-ga-click="Header, create new organization">
    New organization
  </a>



  <div class="dropdown-divider"></div>
  <div class="dropdown-header">
    <span title="sameersbn/docker-postgresql">This repository</span>
  </div>
    <a class="dropdown-item" href="/sameersbn/docker-postgresql/issues/new" data-ga-click="Header, create new issue">
      New issue
    </a>

      </ul>
    </details>
  </li>

  <li class="dropdown js-menu-container">

    <details class="dropdown-details details-reset js-dropdown-details d-flex pl-2 flex-items-center">
      <summary class="HeaderNavlink name mt-1"
        aria-label="View profile and more"
        data-ga-click="Header, show menu, icon:avatar">
        <img alt="@chinvnal" class="avatar float-left mr-1" src="https://avatars2.githubusercontent.com/u/35593087?s=40&amp;v=4" height="20" width="20">
        <span class="dropdown-caret"></span>
      </summary>

      <ul class="dropdown-menu dropdown-menu-sw">
        <li class="dropdown-header header-nav-current-user css-truncate">
          Signed in as <strong class="css-truncate-target">chinvnal</strong>
        </li>

        <li class="dropdown-divider"></li>

        <li><a class="dropdown-item" href="/chinvnal" data-ga-click="Header, go to profile, text:your profile">
          Your profile
        </a></li>
        <li><a class="dropdown-item" href="/chinvnal?tab=stars" data-ga-click="Header, go to starred repos, text:your stars">
          Your stars
        </a></li>
          <li><a class="dropdown-item" href="https://gist.github.com/" data-ga-click="Header, your gists, text:your gists">Your gists</a></li>

        <li class="dropdown-divider"></li>

        <li><a class="dropdown-item" href="https://help.github.com" data-ga-click="Header, go to help, text:help">
          Help
        </a></li>

        <li><a class="dropdown-item" href="/settings/profile" data-ga-click="Header, go to settings, icon:settings">
          Settings
        </a></li>

        <li><!-- '"` --><!-- </textarea></xmp> --></option></form><form class="logout-form" action="/logout" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="bRhXXfhGPW91KzhSPTGEofRA5G/COT2s4tiyaOAoz/D0FdcanS71i904IjPpo20x3R8S5a/crNQ31g/gk+m0Rw==" />
          <button type="submit" class="dropdown-item dropdown-signout" data-ga-click="Header, sign out, icon:logout">
            Sign out
          </button>
        </form></li>
      </ul>
    </details>
  </li>
</ul>



        <!-- '"` --><!-- </textarea></xmp> --></option></form><form class="sr-only right-0" action="/logout" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="wgS0M7yQod2V/dwc8nF5neojOO4hxChlikRoUHD5VWhbCTR02fhpOT3uxn0m45ANw3zOZEwhuR1fStXYAzgu3w==" />
          <button type="submit" class="dropdown-item dropdown-signout" data-ga-click="Header, sign out, icon:logout">
            Sign out
          </button>
</form>      </div>
    </div>
  </div>
</header>

      

  </div>

  <div id="start-of-content" class="show-on-focus"></div>

    <div id="js-flash-container">
</div>



  <div role="main" class="application-main ">
        <div itemscope itemtype="http://schema.org/SoftwareSourceCode" class="">
    <div id="js-repo-pjax-container" data-pjax-container >
      







  <div class="pagehead repohead instapaper_ignore readability-menu experiment-repo-nav  ">
    <div class="repohead-details-container clearfix container">

      <ul class="pagehead-actions">
  <li>
        <!-- '"` --><!-- </textarea></xmp> --></option></form><form data-autosubmit="true" data-remote="true" class="js-social-container" action="/notifications/subscribe" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="iOmlN9XcVg4sdPAqJwjoizqP092G2djLFhJMurl2uBkXKEtbogKPpo3gVPrrozlVawfKh0piPJJGCNBboysmJQ==" />      <input type="hidden" name="repository_id" id="repository_id" value="18726133" class="form-control" />

        <div class="select-menu js-menu-container js-select-menu">
          <a href="/sameersbn/docker-postgresql/subscription"
            class="btn btn-sm btn-with-count select-menu-button js-menu-target"
            role="button"
            aria-haspopup="true"
            aria-expanded="false"
            aria-label="Toggle repository notifications menu"
            data-ga-click="Repository, click Watch settings, action:blob#show">
            <span class="js-select-button">
                <svg class="octicon octicon-eye" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"/></svg>
                Watch
            </span>
          </a>
          <a class="social-count js-social-count"
            href="/sameersbn/docker-postgresql/watchers"
            aria-label="40 users are watching this repository">
            40
          </a>

        <div class="select-menu-modal-holder">
          <div class="select-menu-modal subscription-menu-modal js-menu-content">
            <div class="select-menu-header js-navigation-enable" tabindex="-1">
              <svg class="octicon octicon-x js-menu-close" role="img" aria-label="Close" viewBox="0 0 12 16" version="1.1" width="12" height="16"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"/></svg>
              <span class="select-menu-title">Notifications</span>
            </div>

              <div class="select-menu-list js-navigation-container" role="menu">

                <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
                  <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
                  <div class="select-menu-item-text">
                    <input type="radio" name="do" id="do_included" value="included" checked="checked" />
                    <span class="select-menu-item-heading">Not watching</span>
                    <span class="description">Be notified when participating or @mentioned.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <svg class="octicon octicon-eye" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"/></svg>
                      Watch
                    </span>
                  </div>
                </div>

                <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                  <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
                  <div class="select-menu-item-text">
                    <input type="radio" name="do" id="do_subscribed" value="subscribed" />
                    <span class="select-menu-item-heading">Watching</span>
                    <span class="description">Be notified of all conversations.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <svg class="octicon octicon-eye" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"/></svg>
                        Unwatch
                    </span>
                  </div>
                </div>

                <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                  <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
                  <div class="select-menu-item-text">
                    <input type="radio" name="do" id="do_ignore" value="ignore" />
                    <span class="select-menu-item-heading">Ignoring</span>
                    <span class="description">Never be notified.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <svg class="octicon octicon-mute" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8 2.81v10.38c0 .67-.81 1-1.28.53L3 10H1c-.55 0-1-.45-1-1V7c0-.55.45-1 1-1h2l3.72-3.72C7.19 1.81 8 2.14 8 2.81zm7.53 3.22l-1.06-1.06-1.97 1.97-1.97-1.97-1.06 1.06L11.44 8 9.47 9.97l1.06 1.06 1.97-1.97 1.97 1.97 1.06-1.06L13.56 8l1.97-1.97z"/></svg>
                        Stop ignoring
                    </span>
                  </div>
                </div>

              </div>

            </div>
          </div>
        </div>
</form>
  </li>

  <li>
    
  <div class="js-toggler-container js-social-container starring-container ">
    <!-- '"` --><!-- </textarea></xmp> --></option></form><form class="starred js-social-form" action="/sameersbn/docker-postgresql/unstar" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="Of8X6adWI+D1XJJRatGa0uqyYfzH7wRDqTNvuvmCQQ57D1vaUEmqA/ualz4c1Z9SAR3Rgcn1dW+b7QhomoYrCw==" />
      <input type="hidden" name="context" value="repository"></input>
      <button
        type="submit"
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Unstar this repository" title="Unstar sameersbn/docker-postgresql"
        data-ga-click="Repository, click unstar button, action:blob#show; text:Unstar">
        <svg class="octicon octicon-star" viewBox="0 0 14 16" version="1.1" width="14" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M14 6l-4.9-.64L7 1 4.9 5.36 0 6l3.6 3.26L2.67 14 7 11.67 11.33 14l-.93-4.74z"/></svg>
        Unstar
      </button>
        <a class="social-count js-social-count" href="/sameersbn/docker-postgresql/stargazers"
           aria-label="673 users starred this repository">
          673
        </a>
</form>
    <!-- '"` --><!-- </textarea></xmp> --></option></form><form class="unstarred js-social-form" action="/sameersbn/docker-postgresql/star" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="ffyxemsgqyYXFnFsiRnqYnGbGLrdK9GzsRxqLILbdfrWBrxUaSQA9QswztnTrEOU3c5MtIG/88MfK+lHOQDrEw==" />
      <input type="hidden" name="context" value="repository"></input>
      <button
        type="submit"
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Star this repository" title="Star sameersbn/docker-postgresql"
        data-ga-click="Repository, click star button, action:blob#show; text:Star">
        <svg class="octicon octicon-star" viewBox="0 0 14 16" version="1.1" width="14" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M14 6l-4.9-.64L7 1 4.9 5.36 0 6l3.6 3.26L2.67 14 7 11.67 11.33 14l-.93-4.74z"/></svg>
        Star
      </button>
        <a class="social-count js-social-count" href="/sameersbn/docker-postgresql/stargazers"
           aria-label="673 users starred this repository">
          673
        </a>
</form>  </div>

  </li>

  <li>
          <a href="#fork-destination-box" class="btn btn-sm btn-with-count"
              title="Fork your own copy of sameersbn/docker-postgresql to your account"
              aria-label="Fork your own copy of sameersbn/docker-postgresql to your account"
              rel="facebox"
              data-ga-click="Repository, show fork modal, action:blob#show; text:Fork">
              <svg class="octicon octicon-repo-forked" viewBox="0 0 10 16" version="1.1" width="10" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8 1a1.993 1.993 0 0 0-1 3.72V6L5 8 3 6V4.72A1.993 1.993 0 0 0 2 1a1.993 1.993 0 0 0-1 3.72V6.5l3 3v1.78A1.993 1.993 0 0 0 5 15a1.993 1.993 0 0 0 1-3.72V9.5l3-3V4.72A1.993 1.993 0 0 0 8 1zM2 4.2C1.34 4.2.8 3.65.8 3c0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3 10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3-10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2z"/></svg>
            Fork
          </a>

          <div id="fork-destination-box" style="display: none;">
            <h2 class="facebox-header" data-facebox-id="facebox-header">Where should we fork this repository?</h2>
            <include-fragment src=""
                class="js-fork-select-fragment fork-select-fragment"
                data-url="/sameersbn/docker-postgresql/fork?fragment=1">
              <img alt="Loading" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-128.gif" width="64" height="64" />
            </include-fragment>
          </div>

    <a href="/sameersbn/docker-postgresql/network" class="social-count"
       aria-label="293 users forked this repository">
      293
    </a>
  </li>
</ul>

      <h1 class="public ">
  <svg class="octicon octicon-repo" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9H3V8h1v1zm0-3H3v1h1V6zm0-2H3v1h1V4zm0-2H3v1h1V2zm8-1v12c0 .55-.45 1-1 1H6v2l-1.5-1.5L3 16v-2H1c-.55 0-1-.45-1-1V1c0-.55.45-1 1-1h10c.55 0 1 .45 1 1zm-1 10H1v2h2v-1h3v1h5v-2zm0-10H2v9h9V1z"/></svg>
  <span class="author" itemprop="author"><a class="url fn" rel="author" href="/sameersbn">sameersbn</a></span><!--
--><span class="path-divider">/</span><!--
--><strong itemprop="name"><a data-pjax="#js-repo-pjax-container" href="/sameersbn/docker-postgresql">docker-postgresql</a></strong>

</h1>

    </div>
    
<nav class="reponav js-repo-nav js-sidenav-container-pjax container"
     itemscope
     itemtype="http://schema.org/BreadcrumbList"
     role="navigation"
     data-pjax="#js-repo-pjax-container">

  <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
    <a class="js-selected-navigation-item selected reponav-item" itemprop="url" data-hotkey="g c" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches repo_packages /sameersbn/docker-postgresql" href="/sameersbn/docker-postgresql">
      <svg class="octicon octicon-code" viewBox="0 0 14 16" version="1.1" width="14" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M9.5 3L8 4.5 11.5 8 8 11.5 9.5 13 14 8 9.5 3zm-5 0L0 8l4.5 5L6 11.5 2.5 8 6 4.5 4.5 3z"/></svg>
      <span itemprop="name">Code</span>
      <meta itemprop="position" content="1">
</a>  </span>

    <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
      <a itemprop="url" data-hotkey="g i" class="js-selected-navigation-item reponav-item" data-selected-links="repo_issues repo_labels repo_milestones /sameersbn/docker-postgresql/issues" href="/sameersbn/docker-postgresql/issues">
        <svg class="octicon octicon-issue-opened" viewBox="0 0 14 16" version="1.1" width="14" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7 2.3c3.14 0 5.7 2.56 5.7 5.7s-2.56 5.7-5.7 5.7A5.71 5.71 0 0 1 1.3 8c0-3.14 2.56-5.7 5.7-5.7zM7 1C3.14 1 0 4.14 0 8s3.14 7 7 7 7-3.14 7-7-3.14-7-7-7zm1 3H6v5h2V4zm0 6H6v2h2v-2z"/></svg>
        <span itemprop="name">Issues</span>
        <span class="Counter">26</span>
        <meta itemprop="position" content="2">
</a>    </span>

  <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
    <a data-hotkey="g p" itemprop="url" class="js-selected-navigation-item reponav-item" data-selected-links="repo_pulls checks /sameersbn/docker-postgresql/pulls" href="/sameersbn/docker-postgresql/pulls">
      <svg class="octicon octicon-git-pull-request" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M11 11.28V5c-.03-.78-.34-1.47-.94-2.06C9.46 2.35 8.78 2.03 8 2H7V0L4 3l3 3V4h1c.27.02.48.11.69.31.21.2.3.42.31.69v6.28A1.993 1.993 0 0 0 10 15a1.993 1.993 0 0 0 1-3.72zm-1 2.92c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zM4 3c0-1.11-.89-2-2-2a1.993 1.993 0 0 0-1 3.72v6.56A1.993 1.993 0 0 0 2 15a1.993 1.993 0 0 0 1-3.72V4.72c.59-.34 1-.98 1-1.72zm-.8 10c0 .66-.55 1.2-1.2 1.2-.65 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2zM2 4.2C1.34 4.2.8 3.65.8 3c0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2z"/></svg>
      <span itemprop="name">Pull requests</span>
      <span class="Counter">11</span>
      <meta itemprop="position" content="3">
</a>  </span>

    <a data-hotkey="g b" class="js-selected-navigation-item reponav-item" data-selected-links="repo_projects new_repo_project repo_project /sameersbn/docker-postgresql/projects" href="/sameersbn/docker-postgresql/projects">
      <svg class="octicon octicon-project" viewBox="0 0 15 16" version="1.1" width="15" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M10 12h3V2h-3v10zm-4-2h3V2H6v8zm-4 4h3V2H2v12zm-1 1h13V1H1v14zM14 0H1a1 1 0 0 0-1 1v14a1 1 0 0 0 1 1h13a1 1 0 0 0 1-1V1a1 1 0 0 0-1-1z"/></svg>
      Projects
      <span class="Counter" >0</span>
</a>
    <a class="js-selected-navigation-item reponav-item" data-hotkey="g w" data-selected-links="repo_wiki /sameersbn/docker-postgresql/wiki" href="/sameersbn/docker-postgresql/wiki">
      <svg class="octicon octicon-book" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M3 5h4v1H3V5zm0 3h4V7H3v1zm0 2h4V9H3v1zm11-5h-4v1h4V5zm0 2h-4v1h4V7zm0 2h-4v1h4V9zm2-6v9c0 .55-.45 1-1 1H9.5l-1 1-1-1H2c-.55 0-1-.45-1-1V3c0-.55.45-1 1-1h5.5l1 1 1-1H15c.55 0 1 .45 1 1zm-8 .5L7.5 3H2v9h6V3.5zm7-.5H9.5l-.5.5V12h6V3z"/></svg>
      Wiki
</a>

  <a class="js-selected-navigation-item reponav-item" data-selected-links="repo_graphs repo_contributors dependency_graph pulse /sameersbn/docker-postgresql/pulse" href="/sameersbn/docker-postgresql/pulse">
    <svg class="octicon octicon-graph" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M16 14v1H0V0h1v14h15zM5 13H3V8h2v5zm4 0H7V3h2v10zm4 0h-2V6h2v7z"/></svg>
    Insights
</a>

</nav>


  </div>

<div class="container new-discussion-timeline experiment-repo-nav  ">
  <div class="repository-content ">

    
  <a class="d-none js-permalink-shortcut" data-hotkey="y" href="/sameersbn/docker-postgresql/blob/f02df7722b542772fa973173b2b6890e2bf90552/README.md">Permalink</a>

  <!-- blob contrib key: blob_contributors:v21:bbee027f9b5f7be8ba961c9794e96e73 -->

  <div class="file-navigation">
    
<div class="select-menu branch-select-menu js-menu-container js-select-menu float-left">
  <button class=" btn btn-sm select-menu-button js-menu-target css-truncate" data-hotkey="w"
    
    type="button" aria-label="Switch branches or tags" aria-expanded="false" aria-haspopup="true">
      <i>Branch:</i>
      <span class="js-select-button css-truncate-target">master</span>
  </button>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax>

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <svg class="octicon octicon-x js-menu-close" role="img" aria-label="Close" viewBox="0 0 12 16" version="1.1" width="12" height="16"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"/></svg>
        <span class="select-menu-title">Switch branches/tags</span>
      </div>

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="form-control js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" data-filter-placeholder="Filter branches/tags" class="js-select-menu-tab" role="tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" data-filter-placeholder="Find a tag…" class="js-select-menu-tab" role="tab">Tags</a>
            </li>
          </ul>
        </div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches" role="menu">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open selected"
               href="/sameersbn/docker-postgresql/blob/master/README.md"
               data-name="master"
               data-skip-pjax="true"
               rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target js-select-menu-filter-text">
                master
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/sameersbn/docker-postgresql/blob/postgis-extension-finalization/README.md"
               data-name="postgis-extension-finalization"
               data-skip-pjax="true"
               rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target js-select-menu-filter-text">
                postgis-extension-finalization
              </span>
            </a>
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/v9.4/README.md"
              data-name="v9.4"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="v9.4">
                v9.4
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/v9.4-5/README.md"
              data-name="v9.4-5"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="v9.4-5">
                v9.4-5
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/v9.4-4/README.md"
              data-name="v9.4-4"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="v9.4-4">
                v9.4-4
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/v9.4-3/README.md"
              data-name="v9.4-3"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="v9.4-3">
                v9.4-3
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/v9.4-2/README.md"
              data-name="v9.4-2"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="v9.4-2">
                v9.4-2
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/v9.4-1/README.md"
              data-name="v9.4-1"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="v9.4-1">
                v9.4-1
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/v9.1/README.md"
              data-name="v9.1"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="v9.1">
                v9.1
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/v9.1-2/README.md"
              data-name="v9.1-2"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="v9.1-2">
                v9.1-2
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/v9.1-1/README.md"
              data-name="v9.1-1"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="v9.1-1">
                v9.1-1
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.6/README.md"
              data-name="9.6"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.6">
                9.6
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.6-2/README.md"
              data-name="9.6-2"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.6-2">
                9.6-2
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.6-1/README.md"
              data-name="9.6-1"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.6-1">
                9.6-1
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.5/README.md"
              data-name="9.5"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.5">
                9.5
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.5-4/README.md"
              data-name="9.5-4"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.5-4">
                9.5-4
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.5-3/README.md"
              data-name="9.5-3"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.5-3">
                9.5-3
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.5-2/README.md"
              data-name="9.5-2"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.5-2">
                9.5-2
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.5-1/README.md"
              data-name="9.5-1"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.5-1">
                9.5-1
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-24/README.md"
              data-name="9.4-24"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-24">
                9.4-24
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-23/README.md"
              data-name="9.4-23"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-23">
                9.4-23
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-22/README.md"
              data-name="9.4-22"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-22">
                9.4-22
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-21/README.md"
              data-name="9.4-21"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-21">
                9.4-21
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-20/README.md"
              data-name="9.4-20"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-20">
                9.4-20
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-19/README.md"
              data-name="9.4-19"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-19">
                9.4-19
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-18/README.md"
              data-name="9.4-18"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-18">
                9.4-18
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-17/README.md"
              data-name="9.4-17"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-17">
                9.4-17
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-16/README.md"
              data-name="9.4-16"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-16">
                9.4-16
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-15/README.md"
              data-name="9.4-15"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-15">
                9.4-15
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-14/README.md"
              data-name="9.4-14"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-14">
                9.4-14
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-13/README.md"
              data-name="9.4-13"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-13">
                9.4-13
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-12/README.md"
              data-name="9.4-12"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-12">
                9.4-12
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-11/README.md"
              data-name="9.4-11"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-11">
                9.4-11
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-10/README.md"
              data-name="9.4-10"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-10">
                9.4-10
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-9/README.md"
              data-name="9.4-9"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-9">
                9.4-9
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-8/README.md"
              data-name="9.4-8"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-8">
                9.4-8
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-7/README.md"
              data-name="9.4-7"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-7">
                9.4-7
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-6/README.md"
              data-name="9.4-6"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-6">
                9.4-6
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/sameersbn/docker-postgresql/tree/9.4-5/README.md"
              data-name="9.4-5"
              data-skip-pjax="true"
              rel="nofollow">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="9.4-5">
                9.4-5
              </span>
            </a>
        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div>

    </div>
  </div>
</div>

    <div class="BtnGroup float-right">
      <a href="/sameersbn/docker-postgresql/find/master"
            class="js-pjax-capture-input btn btn-sm BtnGroup-item"
            data-pjax
            data-hotkey="t">
        Find file
      </a>
      <clipboard-copy
            for="blob-path"
            aria-label="Copy file path to clipboard"
            class="btn btn-sm BtnGroup-item tooltipped tooltipped-s"
            copied-label="Copied!">
        Copy path
      </clipboard-copy>
    </div>
    <div id="blob-path" class="breadcrumb">
      <span class="repo-root js-repo-root"><span class="js-path-segment"><a data-pjax="true" href="/sameersbn/docker-postgresql"><span>docker-postgresql</span></a></span></span><span class="separator">/</span><strong class="final-path">README.md</strong>
    </div>
  </div>


  <include-fragment src="/sameersbn/docker-postgresql/contributors/master/README.md" class="commit-tease">
    <div>
      Fetching contributors&hellip;
    </div>

    <div class="commit-tease-contributors">
      <img alt="" class="loader-loading float-left" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32-EAF2F5.gif" width="16" height="16" />
      <span class="loader-error">Cannot retrieve contributors at this time</span>
    </div>
</include-fragment>

  <div class="file">
    <div class="file-header">
  <div class="file-actions">

    <div class="BtnGroup">
      <a id="raw-url" class="btn btn-sm BtnGroup-item" href="/sameersbn/docker-postgresql/raw/master/README.md">Raw</a>
        <a class="btn btn-sm js-update-url-with-hash BtnGroup-item" data-hotkey="b" href="/sameersbn/docker-postgresql/blame/master/README.md">Blame</a>
      <a rel="nofollow" class="btn btn-sm BtnGroup-item" href="/sameersbn/docker-postgresql/commits/master/README.md">History</a>
    </div>


          <!-- '"` --><!-- </textarea></xmp> --></option></form><form class="inline-form js-update-url-with-hash" action="/sameersbn/docker-postgresql/edit/master/README.md" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="cLZRdDTDG/4lQQTBMLLugp8eCoRG2R0+L3qBTa0zLYhRb6l6pp45Ziq5+yUAsPKrrxZHgTvp8FlyIfMUPA1A8Q==" />
            <button class="btn-octicon tooltipped tooltipped-nw" type="submit"
              aria-label="Fork this project and edit the file" data-hotkey="e" data-disable-with>
              <svg class="octicon octicon-pencil" viewBox="0 0 14 16" version="1.1" width="14" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M0 12v3h3l8-8-3-3-8 8zm3 2H1v-2h1v1h1v1zm10.3-9.3L12 6 9 3l1.3-1.3a.996.996 0 0 1 1.41 0l1.59 1.59c.39.39.39 1.02 0 1.41z"/></svg>
            </button>
</form>
        <!-- '"` --><!-- </textarea></xmp> --></option></form><form class="inline-form" action="/sameersbn/docker-postgresql/delete/master/README.md" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="EYnUtNn/lGAdF/ZIfM3l9ypkNeCQy8KlA3gKpAazVNnHaW/mCCLmaRXImlgSQ3Qhli9I6MA9DaNB1QQbqNq7aw==" />
          <button class="btn-octicon btn-octicon-danger tooltipped tooltipped-nw" type="submit"
            aria-label="Fork this project and delete the file" data-disable-with>
            <svg class="octicon octicon-trashcan" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M11 2H9c0-.55-.45-1-1-1H5c-.55 0-1 .45-1 1H2c-.55 0-1 .45-1 1v1c0 .55.45 1 1 1v9c0 .55.45 1 1 1h7c.55 0 1-.45 1-1V5c.55 0 1-.45 1-1V3c0-.55-.45-1-1-1zm-1 12H3V5h1v8h1V5h1v8h1V5h1v8h1V5h1v9zm1-10H2V3h9v1z"/></svg>
          </button>
</form>  </div>

  <div class="file-info">
      387 lines (267 sloc)
      <span class="file-info-divider"></span>
    16.2 KB
  </div>
</div>

    
  <div id="readme" class="readme blob instapaper_body">
    <article class="markdown-body entry-content" itemprop="text"><p><a href="https://circleci.com/gh/sameersbn/docker-postgresql" rel="nofollow"><img src="https://camo.githubusercontent.com/85a49f970807b24351dfd94860602092ffbd15af/68747470733a2f2f636972636c6563692e636f6d2f67682f73616d65657273626e2f646f636b65722d706f737467726573716c2e7376673f7374796c653d736869656c64" alt="Circle CI" data-canonical-src="https://circleci.com/gh/sameersbn/docker-postgresql.svg?style=shield" style="max-width:100%;"></a> <a href="https://quay.io/repository/sameersbn/postgresql" rel="nofollow"><img src="https://camo.githubusercontent.com/cb38304668add0460edbacab197fbe3255641bae/68747470733a2f2f717561792e696f2f7265706f7369746f72792f73616d65657273626e2f706f737467726573716c2f737461747573" alt="Docker Repository on Quay.io" title="Docker Repository on Quay.io" data-canonical-src="https://quay.io/repository/sameersbn/postgresql/status" style="max-width:100%;"></a> <a href="https://imagelayers.io/?images=sameersbn/postgresql:latest" title="Get your own badge on imagelayers.io" rel="nofollow"><img src="https://camo.githubusercontent.com/8e6bf6c4a788665f4d1aad05cb99ca84f2f435d2/68747470733a2f2f62616467652e696d6167656c61796572732e696f2f73616d65657273626e2f706f737467726573716c2e737667" alt="" data-canonical-src="https://badge.imagelayers.io/sameersbn/postgresql.svg" style="max-width:100%;"></a></p>
<h1><a id="user-content-sameersbnpostgresql96-2" class="anchor" aria-hidden="true" href="#sameersbnpostgresql96-2"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>sameersbn/postgresql:9.6-2</h1>
<ul>
<li><a href="#introduction">Introduction</a>
<ul>
<li><a href="#contributing">Contributing</a></li>
<li><a href="#issues">Issues</a></li>
</ul>
</li>
<li><a href="#getting-started">Getting started</a>
<ul>
<li><a href="#installation">Installation</a></li>
<li><a href="#quickstart">Quickstart</a></li>
<li><a href="#persistence">Persistence</a></li>
<li><a href="#trusting-local-connections">Trusting local connections</a></li>
<li><a href="#setting-postgres-user-password">Setting <code>postgres</code> user password</a></li>
<li><a href="#creating-database-user">Creating database user</a></li>
<li><a href="#creating-databases">Creating databases</a></li>
<li><a href="#granting-user-access-to-a-database">Granting user access to a database</a></li>
<li><a href="#enabling-extensions">Enabling extensions</a></li>
<li><a href="#creating-replication-user">Creating replication user</a></li>
<li><a href="#setting-up-a-replication-cluster">Setting up a replication cluster</a></li>
<li><a href="#creating-a-snapshot">Creating a snapshot</a></li>
<li><a href="#creating-a-backup">Creating a backup</a></li>
<li><a href="#command-line-arguments">Command-line arguments</a></li>
<li><a href="#logs">Logs</a></li>
<li><a href="#uidgid-mapping">UID/GID mapping</a></li>
</ul>
</li>
<li><a href="#maintenance">Maintenance</a>
<ul>
<li><a href="#upgrading">Upgrading</a></li>
<li><a href="#shell-access">Shell Access</a></li>
</ul>
</li>
</ul>
<h1><a id="user-content-introduction" class="anchor" aria-hidden="true" href="#introduction"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Introduction</h1>
<p><code>Dockerfile</code> to create a <a href="https://www.docker.com/" rel="nofollow">Docker</a> container image for <a href="http://postgresql.org/" rel="nofollow">PostgreSQL</a>.</p>
<p>PostgreSQL is an object-relational database management system (ORDBMS) with an emphasis on extensibility and standards-compliance [<a href="https://en.wikipedia.org/wiki/PostgreSQL" rel="nofollow">source</a>].</p>
<h2><a id="user-content-contributing" class="anchor" aria-hidden="true" href="#contributing"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Contributing</h2>
<p>If you find this image useful here's how you can help:</p>
<ul>
<li>Send a pull request with your awesome features and bug fixes</li>
<li>Help users resolve their <a href="/sameersbn/docker-postgresql/issues?q=is%3Aopen+is%3Aissue">issues</a>.</li>
<li>Support the development of this image with a <a href="http://www.damagehead.com/donate/" rel="nofollow">donation</a></li>
</ul>
<h2><a id="user-content-issues" class="anchor" aria-hidden="true" href="#issues"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Issues</h2>
<p>Before reporting your issue please try updating Docker to the latest version and check if it resolves the issue. Refer to the Docker <a href="https://docs.docker.com/installation" rel="nofollow">installation guide</a> for instructions.</p>
<p>SELinux users should try disabling SELinux using the command <code>setenforce 0</code> to see if it resolves the issue.</p>
<p>If the above recommendations do not help then <a href="/sameersbn/docker-postgresql/issues/new">report your issue</a> along with the following information:</p>
<ul>
<li>Output of the <code>docker vers6</code> and <code>docker info</code> commands</li>
<li>The <code>docker run</code> command or <code>docker-compose.yml</code> used to start the image. Mask out the sensitive bits.</li>
<li>Please state if you are using <a href="http://www.boot2docker.io" rel="nofollow">Boot2Docker</a>, <a href="https://www.virtualbox.org" rel="nofollow">VirtualBox</a>, etc.</li>
</ul>
<h1><a id="user-content-getting-started" class="anchor" aria-hidden="true" href="#getting-started"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Getting started</h1>
<h2><a id="user-content-installation" class="anchor" aria-hidden="true" href="#installation"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Installation</h2>
<p>Automated builds of the image are available on <a href="https://hub.docker.com/r/sameersbn/postgresql" rel="nofollow">Dockerhub</a> and is the recommended method of installation.</p>
<blockquote>
<p><strong>Note</strong>: Builds are also available on <a href="https://quay.io/repository/sameersbn/postgresql" rel="nofollow">Quay.io</a></p>
</blockquote>
<div class="highlight highlight-source-shell"><pre>docker pull sameersbn/postgresql:9.6-2</pre></div>
<p>Alternatively you can build the image yourself.</p>
<div class="highlight highlight-source-shell"><pre>docker build -t sameersbn/postgresql github.com/sameersbn/docker-postgresql</pre></div>
<h2><a id="user-content-quickstart" class="anchor" aria-hidden="true" href="#quickstart"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Quickstart</h2>
<p>Start PostgreSQL using:</p>
<div class="highlight highlight-source-shell"><pre>docker run --name postgresql -itd --restart always \
  --publish 5432:5432 \
  --volume /srv/docker/postgresql:/var/lib/postgresql \
  sameersbn/postgresql:9.6-2</pre></div>
<p>Login to the PostgreSQL server using:</p>
<div class="highlight highlight-source-shell"><pre>docker <span class="pl-c1">exec</span> -it postgresql sudo -u postgres psql</pre></div>
<p><em>Alternatively, you can use the sample <a href="/sameersbn/docker-postgresql/blob/master/docker-compose.yml">docker-compose.yml</a> file to start the container using <a href="https://docs.docker.com/compose/" rel="nofollow">Docker Compose</a></em></p>
<h2><a id="user-content-persistence" class="anchor" aria-hidden="true" href="#persistence"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Persistence</h2>
<p>For PostgreSQL to preserve its state across container shutdown and startup you should mount a volume at <code>/var/lib/postgresql</code>.</p>
<blockquote>
<p><em>The <a href="#quickstart">Quickstart</a> command already mounts a volume for persistence.</em></p>
</blockquote>
<p>SELinux users should update the security context of the host mountpoint so that it plays nicely with Docker:</p>
<div class="highlight highlight-source-shell"><pre>mkdir -p /srv/docker/postgresql
chcon -Rt svirt_sandbox_file_t /srv/docker/postgresql</pre></div>
<h2><a id="user-content-trusting-local-connections" class="anchor" aria-hidden="true" href="#trusting-local-connections"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Trusting local connections</h2>
<p>By default connections to the PostgreSQL server need to authenticated using a password. If desired you can trust connections from the local network using the <code>PG_TRUST_LOCALNET</code> variable.</p>
<div class="highlight highlight-source-shell"><pre>docker run --name postgresql -itd --restart always \
  --env <span class="pl-s"><span class="pl-pds">'</span>PG_TRUST_LOCALNET=true<span class="pl-pds">'</span></span> \
  sameersbn/postgresql:9.6-2</pre></div>
<blockquote>
<p><strong>Note</strong></p>
<p>The local network here is network to which the container is attached. This has different meanings depending on the <code>--net</code> parameter specified while starting the container. In the default configuration, this parameter would trust connections from other containers on the <code>docker0</code> bridge.</p>
</blockquote>
<h2><a id="user-content-setting-postgres-user-password" class="anchor" aria-hidden="true" href="#setting-postgres-user-password"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Setting <code>postgres</code> user password</h2>
<p>By default the <code>postgres</code> user is not assigned a password and as a result you can only login to the PostgreSQL server locally. If you wish to login remotely to the PostgreSQL server as the <code>postgres</code> user, you will need to assign a password for the user using the <code>PG_PASSWORD</code> variable.</p>
<div class="highlight highlight-source-shell"><pre>docker run --name postgresql -itd --restart always \
  --env <span class="pl-s"><span class="pl-pds">'</span>PG_PASSWORD=passw0rd<span class="pl-pds">'</span></span> \
  sameersbn/postgresql:9.6-2</pre></div>
<blockquote>
<p><strong>Note</strong></p>
<ul>
<li>When <a href="#persistence">persistence</a> is in use, <code>PG_PASSWORD</code> is effective on the first run.</li>
<li>This feature is only available in the <code>latest</code> and versions &gt; <code>9.4-10</code></li>
</ul>
</blockquote>
<h2><a id="user-content-creating-database-user" class="anchor" aria-hidden="true" href="#creating-database-user"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Creating database user</h2>
<p>A new PostgreSQL database user can be created by specifying the <code>DB_USER</code> and <code>DB_PASS</code> variables while starting the container.</p>
<div class="highlight highlight-source-shell"><pre>docker run --name postgresql -itd --restart always \
  --env <span class="pl-s"><span class="pl-pds">'</span>DB_USER=dbuser<span class="pl-pds">'</span></span> --env <span class="pl-s"><span class="pl-pds">'</span>DB_PASS=dbuserpass<span class="pl-pds">'</span></span> \
  sameersbn/postgresql:9.6-2</pre></div>
<blockquote>
<p><strong>Notes</strong></p>
<ul>
<li>The created user can login remotely</li>
<li>The container will error out if a password is not specified for the user</li>
<li>No changes will be made if the user already exists</li>
<li>Only a single user can be created at each launch</li>
</ul>
</blockquote>
<h2><a id="user-content-creating-databases" class="anchor" aria-hidden="true" href="#creating-databases"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Creating databases</h2>
<p>A new PostgreSQL database can be created by specifying the <code>DB_NAME</code> variable while starting the container.</p>
<div class="highlight highlight-source-shell"><pre>docker run --name postgresql -itd --restart always \
  --env <span class="pl-s"><span class="pl-pds">'</span>DB_NAME=dbname<span class="pl-pds">'</span></span> \
  sameersbn/postgresql:9.6-2</pre></div>
<p>By default databases are created by copying the standard system database named <code>template1</code>. You can specify a different template for your database using the <code>DB_TEMPLATE</code> parameter. Refer to <a href="http://www.postgresql.org/docs/9.4/static/manage-ag-templatedbs.html" rel="nofollow">Template Databases</a> for further information.</p>
<p>Additionally, more than one database can be created by specifying a comma separated list of database names in <code>DB_NAME</code>. For example, the following command creates two new databases named <code>dbname1</code> and <code>dbname2</code>.</p>
<p><em>This feature is only available in releases greater than <code>9.1-1</code></em></p>
<div class="highlight highlight-source-shell"><pre>docker run --name postgresql -itd --restart always \
  --env <span class="pl-s"><span class="pl-pds">'</span>DB_NAME=dbname1,dbname2<span class="pl-pds">'</span></span> \
  sameersbn/postgresql:9.6-2</pre></div>
<h2><a id="user-content-granting-user-access-to-a-database" class="anchor" aria-hidden="true" href="#granting-user-access-to-a-database"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Granting user access to a database</h2>
<p>If the <code>DB_USER</code> and <code>DB_PASS</code> variables are specified along with the <code>DB_NAME</code> variable, then the user specified in <code>DB_USER</code> will be granted access to all the databases listed in <code>DB_NAME</code>. Note that if the user and/or databases do not exist, they will be created.</p>
<div class="highlight highlight-source-shell"><pre>docker run --name postgresql -itd --restart always \
  --env <span class="pl-s"><span class="pl-pds">'</span>DB_USER=dbuser<span class="pl-pds">'</span></span> --env <span class="pl-s"><span class="pl-pds">'</span>DB_PASS=dbuserpass<span class="pl-pds">'</span></span> \
  --env <span class="pl-s"><span class="pl-pds">'</span>DB_NAME=dbname1,dbname2<span class="pl-pds">'</span></span> \
  sameersbn/postgresql:9.6-2</pre></div>
<p>In the above example <code>dbuser</code> with be granted access to both the <code>dbname1</code> and <code>dbname2</code> databases.</p>
<h1><a id="user-content-enabling-extensions" class="anchor" aria-hidden="true" href="#enabling-extensions"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Enabling extensions</h1>
<p>The image also packages the <a href="http://www.postgresql.org/docs/9.4/static/contrib.html" rel="nofollow">postgres contrib module</a>. A comma separated list of modules can be specified using the <code>DB_EXTENSION</code> parameter.</p>
<div class="highlight highlight-source-shell"><pre>docker run --name postgresql -itd \
  --env <span class="pl-s"><span class="pl-pds">'</span>DB_NAME=db1,db2<span class="pl-pds">'</span></span> --env <span class="pl-s"><span class="pl-pds">'</span>DB_EXTENSION=unaccent,pg_trgm<span class="pl-pds">'</span></span> \
  sameersbn/postgresql:9.6-2</pre></div>
<p>The above command enables the <code>unaccent</code> and <code>pg_trgm</code> modules on the databases listed in <code>DB_NAME</code>, namely <code>db1</code> and <code>db2</code>.</p>
<blockquote>
<p><strong>NOTE</strong>:</p>
<p>This option deprecates the <code>DB_UNACCENT</code> parameter.</p>
</blockquote>
<h2><a id="user-content-creating-replication-user" class="anchor" aria-hidden="true" href="#creating-replication-user"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Creating replication user</h2>
<p>Similar to the creation of a database user, a new PostgreSQL replication user can be created by specifying the <code>REPLICATION_USER</code> and <code>REPLICATION_PASS</code> variables while starting the container.</p>
<div class="highlight highlight-source-shell"><pre>docker run --name postgresql -itd --restart always \
  --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_USER=repluser<span class="pl-pds">'</span></span> --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_PASS=repluserpass<span class="pl-pds">'</span></span> \
  sameersbn/postgresql:9.6-2</pre></div>
<blockquote>
<p><strong>Notes</strong></p>
<ul>
<li>The created user can login remotely</li>
<li>The container will error out if a password is not specified for the user</li>
<li>No changes will be made if the user already exists</li>
<li>Only a single user can be created at each launch</li>
</ul>
</blockquote>
<p><em>It is a good idea to create a replication user even if you are not going to use it as it will allow you to setup slave nodes and/or generate snapshots and backups when the need arises.</em></p>
<h2><a id="user-content-setting-up-a-replication-cluster" class="anchor" aria-hidden="true" href="#setting-up-a-replication-cluster"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Setting up a replication cluster</h2>
<p>When the container is started, it is by default configured to act as a master node in a replication cluster. This means that you can scale your PostgreSQL database backend when the need arises without incurring any downtime. However do note that a replication user must exist on the master node for this to work.</p>
<p>Begin by creating the master node of our cluster:</p>
<div class="highlight highlight-source-shell"><pre>docker run --name postgresql-master -itd --restart always \
  --env <span class="pl-s"><span class="pl-pds">'</span>DB_USER=dbuser<span class="pl-pds">'</span></span> --env <span class="pl-s"><span class="pl-pds">'</span>DB_PASS=dbuserpass<span class="pl-pds">'</span></span> --env <span class="pl-s"><span class="pl-pds">'</span>DB_NAME=dbname<span class="pl-pds">'</span></span> \
  --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_USER=repluser<span class="pl-pds">'</span></span> --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_PASS=repluserpass<span class="pl-pds">'</span></span> \
  sameersbn/postgresql:9.6-2</pre></div>
<p>Notice that no additional arguments are specified while starting the master node of the cluster.</p>
<p>To create a replication slave the <code>REPLICATION_MODE</code> variable should be set to <code>slave</code> and additionally the <code>REPLICATION_HOST</code>, <code>REPLICATION_PORT</code>, <code>REPLICATION_SSLMODE</code>, <code>REPLICATION_USER</code> and <code>REPLICATION_PASS</code> variables should be specified.</p>
<p>Create a slave node:</p>
<div class="highlight highlight-source-shell"><pre>docker run --name postgresql-slave01 -itd --restart always \
  --link postgresql-master:master \
  --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_MODE=slave<span class="pl-pds">'</span></span> --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_SSLMODE=prefer<span class="pl-pds">'</span></span> \
  --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_HOST=master<span class="pl-pds">'</span></span> --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_PORT=5432<span class="pl-pds">'</span></span>  \
  --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_USER=repluser<span class="pl-pds">'</span></span> --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_PASS=repluserpass<span class="pl-pds">'</span></span> \
  sameersbn/postgresql:9.6-2</pre></div>
<p><em>In the above command, we used docker links so that we can address the master node using the <code>master</code> alias in <code>REPLICATION_HOST</code>.</em></p>
<blockquote>
<p><strong>Note</strong></p>
<ul>
<li>The default value of <code>REPLICATION_PORT</code> is <code>5432</code></li>
<li>The default value of <code>REPLICATION_SSLMODE</code> is <code>prefer</code></li>
<li>The value of <code>REPLICATION_USER</code> and <code>REPLICATION_PASS</code> should be the same as the ones specified on the master node.</li>
<li>With <a href="#persistence">persistence</a> in use, if the container is stopped and started, for the container continue to function as a slave you need to ensure that <code>REPLICATION_MODE=slave</code> is defined in the containers environment. In the absense of which the slave configuration will be turned off and the node will allow writing to it while having the last synced data from the master.</li>
</ul>
</blockquote>
<p>And just like that with minimal effort you have a PostgreSQL replication cluster setup. You can create additional slaves to scale the cluster horizontally.</p>
<p>Here are some important notes about a PostgreSQL replication cluster:</p>
<ul>
<li>Writes can only occur on the master</li>
<li>Slaves are read-only</li>
<li>For best performance, limit the reads to the slave nodes</li>
</ul>
<h2><a id="user-content-creating-a-snapshot" class="anchor" aria-hidden="true" href="#creating-a-snapshot"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Creating a snapshot</h2>
<p>Similar to a creating replication slave node, you can create a snapshot of the master by specifying <code>REPLICATION_MODE=snapshot</code>.</p>
<p>Once the master node is created as specified in <a href="#setting-up-a-replication-cluster">Setting up a replication cluster</a>, you can create a snapshot using:</p>
<div class="highlight highlight-source-shell"><pre>docker run --name postgresql-snapshot -itd --restart always \
  --link postgresql-master:master \
  --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_MODE=snapshot<span class="pl-pds">'</span></span> --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_SSLMODE=prefer<span class="pl-pds">'</span></span> \
  --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_HOST=master<span class="pl-pds">'</span></span> --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_PORT=5432<span class="pl-pds">'</span></span>  \
  --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_USER=repluser<span class="pl-pds">'</span></span> --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_PASS=repluserpass<span class="pl-pds">'</span></span> \
  sameersbn/postgresql:9.6-2</pre></div>
<p>The difference between a slave and a snapshot is that a slave is read-only and updated whenever the master data is updated (streaming replication), while a snapshot is read-write and is not updated after the initial snapshot of the data from the master.</p>
<p>This is useful for developers to quickly snapshot the current state of a live database and use it for development/debugging purposes without altering the database on the live instance.</p>
<h2><a id="user-content-creating-a-backup" class="anchor" aria-hidden="true" href="#creating-a-backup"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Creating a backup</h2>
<p>Just as the case of setting up a slave node or generating a snapshot, you can also create a backup of the data on the master by specifying <code>REPLICATION_MODE=backup</code>.</p>
<blockquote>
<p>The backups are generated with <a href="http://www.postgresql.org/docs/9.4/static/app-pgbasebackup.html" rel="nofollow">pg_basebackup</a> using the replication protocol.</p>
</blockquote>
<p>Once the master node is created as specified in <a href="#setting-up-a-replication-cluster">Setting up a replication cluster</a>, you can create a point-in-time backup using:</p>
<div class="highlight highlight-source-shell"><pre>docker run --name postgresql-backup -it --rm \
  --link postgresql-master:master \
  --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_MODE=backup<span class="pl-pds">'</span></span> --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_SSLMODE=prefer<span class="pl-pds">'</span></span> \
  --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_HOST=master<span class="pl-pds">'</span></span> --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_PORT=5432<span class="pl-pds">'</span></span>  \
  --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_USER=repluser<span class="pl-pds">'</span></span> --env <span class="pl-s"><span class="pl-pds">'</span>REPLICATION_PASS=repluserpass<span class="pl-pds">'</span></span> \
  --volume /srv/docker/backups/postgresql.<span class="pl-s"><span class="pl-pds">$(</span>date +%Y%m%d%H%M%S<span class="pl-pds">)</span></span>:/var/lib/postgresql \
  sameersbn/postgresql:9.6-2</pre></div>
<p>Once the backup is generated, the container will exit and the backup of the master data will be available at <code>/srv/docker/backups/postgresql.XXXXXXXXXXXX/</code>. Restoring the backup involves starting a container with the data in <code>/srv/docker/backups/postgresql.XXXXXXXXXXXX</code>.</p>
<h2><a id="user-content-command-line-arguments" class="anchor" aria-hidden="true" href="#command-line-arguments"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Command-line arguments</h2>
<p>You can customize the launch command of PostgreSQL server by specifying arguments for <code>postgres</code> on the <code>docker run</code> command. For example the following command enables connection logging:</p>
<div class="highlight highlight-source-shell"><pre>docker run --name postgresql -itd --restart always \
  sameersbn/postgresql:9.6-2 -c log_connections=on</pre></div>
<p>Please refer to the documentation of <a href="http://www.postgresql.org/docs/9.4/static/app-postgres.html" rel="nofollow">postgres</a> for the complete list of available options.</p>
<h2><a id="user-content-logs" class="anchor" aria-hidden="true" href="#logs"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Logs</h2>
<p>By default the PostgreSQL server logs are sent to the standard output. Using the <a href="#command-line-arguments">Command-line arguments</a> feature you can configure the PostgreSQL server to send the log output to a file using the <code>-c logging_collector=on</code> argument:</p>
<div class="highlight highlight-source-shell"><pre>docker run --name postgresql -itd --restart always \
  sameersbn/postgresql:9.6-2 -c logging_collector=on</pre></div>
<p>To access the PostgreSQL logs you can use <code>docker exec</code>. For example:</p>
<div class="highlight highlight-source-shell"><pre>docker <span class="pl-c1">exec</span> -it postgresql tail -f /var/log/postgresql/postgresql-9.4-main.log</pre></div>
<h1><a id="user-content-uidgid-mapping" class="anchor" aria-hidden="true" href="#uidgid-mapping"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>UID/GID mapping</h1>
<p>The files and processes created by the container are owned by the <code>postgres</code> user that is internal to the container. In the absense of user namespace in docker the UID and GID of the containers <code>postgres</code> user may have different meaning on the host.</p>
<p>For example, a user on the host with the same UID and/or GID as the <code>postgres</code> user of the container will be able to access the data in the persistent volumes mounted from the host as well as be able to KILL the <code>postgres</code> server process started by the container.</p>
<p>To circumvent this issue you can specify the UID and GID for the <code>postgres</code> user of the container using the <code>USERMAP_UID</code> and <code>USERMAP_GID</code> variables respectively.</p>
<p>For example, if you want to assign the <code>postgres</code> user of the container the UID and GID <code>999</code>:</p>
<div class="highlight highlight-source-shell"><pre>docker run --name postgresql -itd --restart always \
  --env <span class="pl-s"><span class="pl-pds">'</span>USERMAP_UID=999<span class="pl-pds">'</span></span> --env <span class="pl-s"><span class="pl-pds">'</span>USERMAP_GID=999<span class="pl-pds">'</span></span> \
  sameersbn/postgresql:9.6-2</pre></div>
<h1><a id="user-content-maintenance" class="anchor" aria-hidden="true" href="#maintenance"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Maintenance</h1>
<h2><a id="user-content-upgrading" class="anchor" aria-hidden="true" href="#upgrading"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Upgrading</h2>
<p>To upgrade to newer releases:</p>
<ol>
<li>Download the updated Docker image:</li>
</ol>
<div class="highlight highlight-source-shell"><pre>docker pull sameersbn/postgresql:9.6-2</pre></div>
<ol start="2">
<li>Stop the currently running image:</li>
</ol>
<div class="highlight highlight-source-shell"><pre>docker stop postgresql</pre></div>
<ol start="3">
<li>Remove the stopped container</li>
</ol>
<div class="highlight highlight-source-shell"><pre>docker rm -v postgresql</pre></div>
<ol start="4">
<li>Start the updated image</li>
</ol>
<div class="highlight highlight-source-shell"><pre>docker run --name postgresql -itd \
  [OPTIONS] \
  sameersbn/postgresql:9.6-2</pre></div>
<h2><a id="user-content-shell-access" class="anchor" aria-hidden="true" href="#shell-access"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Shell Access</h2>
<p>For debugging and maintenance purposes you may want access the containers shell. If you are using Docker version <code>1.3.0</code> or higher you can access a running containers shell by starting <code>bash</code> using <code>docker exec</code>:</p>
<div class="highlight highlight-source-shell"><pre>docker <span class="pl-c1">exec</span> -it postgresql bash</pre></div>
</article>
  </div>

  </div>

  <button type="button" data-facebox="#jump-to-line" data-facebox-class="linejump" data-hotkey="l" class="d-none">Jump to Line</button>
  <div id="jump-to-line" style="display:none">
    <!-- '"` --><!-- </textarea></xmp> --></option></form><form class="js-jump-to-line-form" action="" accept-charset="UTF-8" method="get"><input name="utf8" type="hidden" value="&#x2713;" />
      <input class="form-control linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" aria-label="Jump to line" autofocus>
      <button type="submit" class="btn">Go</button>
</form>  </div>


  </div>
  <div class="modal-backdrop js-touch-events"></div>
</div>

    </div>
  </div>

  </div>

      
<div class="footer container-lg px-3" role="contentinfo">
  <div class="position-relative d-flex flex-justify-between pt-6 pb-2 mt-6 f6 text-gray border-top border-gray-light ">
    <ul class="list-style-none d-flex flex-wrap ">
      <li class="mr-3">&copy; 2018 <span title="0.24959s from unicorn-1432499072-07nn8">GitHub</span>, Inc.</li>
        <li class="mr-3"><a data-ga-click="Footer, go to terms, text:terms" href="https://github.com/site/terms">Terms</a></li>
        <li class="mr-3"><a data-ga-click="Footer, go to privacy, text:privacy" href="https://github.com/site/privacy">Privacy</a></li>
        <li class="mr-3"><a href="https://help.github.com/articles/github-security/" data-ga-click="Footer, go to security, text:security">Security</a></li>
        <li class="mr-3"><a href="https://status.github.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
        <li><a data-ga-click="Footer, go to help, text:help" href="https://help.github.com">Help</a></li>
    </ul>

    <a aria-label="Homepage" title="GitHub" class="footer-octicon" href="https://github.com">
      <svg height="24" class="octicon octicon-mark-github" viewBox="0 0 16 16" version="1.1" width="24" aria-hidden="true"><path fill-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z"/></svg>
</a>
   <ul class="list-style-none d-flex flex-wrap ">
        <li class="mr-3"><a data-ga-click="Footer, go to contact, text:contact" href="https://github.com/contact">Contact GitHub</a></li>
      <li class="mr-3"><a href="https://developer.github.com" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li class="mr-3"><a href="https://training.github.com" data-ga-click="Footer, go to training, text:training">Training</a></li>
      <li class="mr-3"><a href="https://shop.github.com" data-ga-click="Footer, go to shop, text:shop">Shop</a></li>
        <li class="mr-3"><a data-ga-click="Footer, go to blog, text:blog" href="https://github.com/blog">Blog</a></li>
        <li><a data-ga-click="Footer, go to about, text:about" href="https://github.com/about">About</a></li>

    </ul>
  </div>
  <div class="d-flex flex-justify-center pb-6">
    <span class="f6 text-gray-light"></span>
  </div>
</div>



  <div id="ajax-error-message" class="ajax-error-message flash flash-error">
    <svg class="octicon octicon-alert" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8.865 1.52c-.18-.31-.51-.5-.87-.5s-.69.19-.87.5L.275 13.5c-.18.31-.18.69 0 1 .19.31.52.5.87.5h13.7c.36 0 .69-.19.86-.5.17-.31.18-.69.01-1L8.865 1.52zM8.995 13h-2v-2h2v2zm0-3h-2V6h2v4z"/></svg>
    <button type="button" class="flash-close js-ajax-error-dismiss" aria-label="Dismiss error">
      <svg class="octicon octicon-x" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"/></svg>
    </button>
    You can't perform that action at this time.
  </div>


    <script crossorigin="anonymous" integrity="sha512-yZbxaWBZsKMrNH2Y5Vums2LDJVSc71BNgxd04szbH8IR6QMyi9A/gORIf1lXB+RvxVXVc6f6axcbDf9WL9vZdw==" type="application/javascript" src="https://assets-cdn.github.com/assets/compat-680e7bbbbe79068a1cb3142329468a6f.js"></script>
    <script crossorigin="anonymous" integrity="sha512-i8LsUraHpQrhG+Yq03VsmmoVDSyWnORqBPSNDwnTa2ucf7LPURvkWuBEiNroGtzA18aPc1y3dHXSoYwR5qeieg==" type="application/javascript" src="https://assets-cdn.github.com/assets/frameworks-4a55ab3fcf005abef1e8b859483f3cce.js"></script>
    
    <script crossorigin="anonymous" async="async" integrity="sha512-AL2S/gMPc+JZVlhOcB/rGCKZ7i85CDXisEWpTuGrUY8recTizuxTJHf1IdS9Kpd49exSDOJdy0KWNf8sNL3Bbg==" type="application/javascript" src="https://assets-cdn.github.com/assets/github-8cffc7cd56453a90ab98d7374eb33505.js"></script>
    
    
    
    
  <div class="js-stale-session-flash stale-session-flash flash flash-warn flash-banner d-none">
    <svg class="octicon octicon-alert" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8.865 1.52c-.18-.31-.51-.5-.87-.5s-.69.19-.87.5L.275 13.5c-.18.31-.18.69 0 1 .19.31.52.5.87.5h13.7c.36 0 .69-.19.86-.5.17-.31.18-.69.01-1L8.865 1.52zM8.995 13h-2v-2h2v2zm0-3h-2V6h2v4z"/></svg>
    <span class="signed-in-tab-flash">You signed in with another tab or window. <a href="">Reload</a> to refresh your session.</span>
    <span class="signed-out-tab-flash">You signed out in another tab or window. <a href="">Reload</a> to refresh your session.</span>
  </div>
  <div class="facebox" id="facebox" style="display:none;">
  <div class="facebox-popup">
    <div class="facebox-content" role="dialog" aria-labelledby="facebox-header" aria-describedby="facebox-description">
    </div>
    <button type="button" class="facebox-close js-facebox-close" aria-label="Close modal">
      <svg class="octicon octicon-x" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"/></svg>
    </button>
  </div>
</div>

  <div class="Popover js-hovercard-content position-absolute" style="display: none; outline: none;" tabindex="0">
  <div class="Popover-message Popover-message--bottom-left Popover-message--large Box box-shadow-large" style="width:360px;">
  </div>
</div>

<div id="hovercard-aria-description" class="sr-only">
  Press h to open a hovercard with more details.
</div>


  </body>
</html>


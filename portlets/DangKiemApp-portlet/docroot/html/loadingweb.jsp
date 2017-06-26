	<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<style>
		html {
			-webkit-transition: background-color 1s;
			transition: background-color 1s;
		}
		html, body { min-height: 100%; }
		html.loading {
			background: rgb(234, 234, 234) url('/DangKiemApp-portlet/img/zooming.gif') no-repeat 50% 20%;
			-webkit-transition: background-color 0;
			transition: background-color 0;
		}
		body {
			-webkit-transition: opacity 1s ease-in;
			transition: opacity 1s ease-in;
		}
		html.loading body {
			opacity: 0.2;
			-webkit-transition: opacity 0;
			transition: opacity 0;
		}
		button {
			background: #00A3FF;
			color: white;
			padding: 0.2em 0.5em;
			font-size: 1.5em;
		}
		</style>
		<script>
		var html = document.getElementsByTagName('html')[0];	
		
		function loading(){
			document.getElementById("MyElement").className = "loading";
		}
		
		function removeLoading(){
			html.className = html.className.replace(/loading/, '');
		}
	</script>
	</head>

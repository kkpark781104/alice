<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
	<script type="text/javascript" src="/statics/lib/jquery/jquery-1.11.3.js"></script>
	
	<link rel="stylesheet" type="text/css" href="/statics/lib/toast-4.8.1/tui-grid.css" />
    <link rel="stylesheet" type="text/css" href="/statics/lib/toast-4.8.1/tui-grid.min.css" />
	<script type="text/javascript" src="/statics/lib/toast-4.8.1/tui-grid.js"></script>
	<script type="text/javascript" src="/statics/lib/toast-4.8.1/tui-grid.min.js"></script>
	
	
	<script type="text/javascript" src="/resources/tui.grid-master/packages/toast-ui.grid/examples/data/basic-dummy.js"></script>
	<script>
		$(function(){
			
			
			const grid = new tui.Grid({
			    el: document.getElementById('grid'),
			    data: gridData,
			    scrollX: false,
			    scrollY: false,
			    columns: [
			      {
			        header: 'Name',
			        name: 'name'
			      },
			      {
			        header: 'Artist',
			        name: 'artist'
			      },
			      {
			        header: 'Type',
			        name: 'type'
			      },
			      {
			        header: 'Release',
			        name: 'release'
			      },
			      {
			        header: 'Genre',
			        name: 'genre'
			      }
			    ]
			  });
			
		});
	</script>
	
	<body>
		<div class="code-html contents">
      <div id="grid"></div>
    </div>
	</body>
</html>
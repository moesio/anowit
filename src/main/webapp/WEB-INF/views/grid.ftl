<#include "/grid-builder.ftl" />

<#assign gridFieldsCandidate>
	<@spring.messageText "${page.entityName}.page.grid.fields" ""/>
</#assign>
<#if gridFieldsCandidate?length gt 0>
	<#assign gridFields = gridFieldsCandidate?split(",")>
<#else>
	<#assign gridFields = {}>
</#if>

<html>
	<head>
		<title>
			<@spring.messageText "${page.title}" "${page.title}"/><#t>
		</title>
	</head>
	<body>
		<div class="container-fluid">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<table class="table table-bordered table-hover">
						<thead>
							<tr>
								<#list page.formFields?keys as path>
									<#assign field = page.formFields[path]>
									<#if "${field.type}" != "HIDDEN">
										<#assign name>
											${field.name[field.name?string?index_of('.')+1..]}<#t>
										</#assign>
										<#if (gridFields?size gt 0 && gridFields?seq_contains(name)) || (gridFields?size == 0)>
											<td><@compress>
												<@spring.messageText "${field.label}" "${field.label}"/>
											</td></@compress>
										</#if>
									</#if>
								</#list>
								<td><@spring.messageText "grid.action" "grid.action"/></td>
							</tr>
						</thead>
						<tbody>
						<#list list as item>
							<tr>
							<#list page.formFields?keys as path>
								<#assign field = getFormField(item, path) />
								<#if field['view']?has_content>
									<#assign name>
										${field.name[field.name?string?index_of('.')+1..]}<#t>
									</#assign>
									<td><@compress>
										${field.view}
									</@compress></td>
								</#if>
							</#list>
							<td>
								<a href="../../edit/${item["id"]}">Editar</a>
								<a onClick="removal(${item['id']}, this)">Excluir</a>
							</td>
							</tr>
						</#list>
						</tbody>
						<tfoot>
						</tfoot>
					</table>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<a href="../../">
							<button class="btn btn-primary">
								<@spring.messageText "form.button.new" "form.button.new"/>
							</button>
						</a>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
